package com.demo.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.entity.Course;
import com.demo.entity.Student;

public class Main2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			Course maths = new Course("maths");
			Course chem = new Course("cs");
			Course phy = new Course("ece");
			session.persist(maths);
			session.persist(chem);
			session.persist(phy);
			
			Student john =new Student("Jhon");
			Student smith =new Student("smith");
			Student jenny =new Student("Jenny");
			
			john.getCourse().add(maths);
			john.getCourse().add(chem);
			
			
			smith.getCourse().add(maths);
			smith.getCourse().add(phy);
			
			jenny.getCourse().add(maths);
			jenny.getCourse().add(chem);
			
			session.persist(jenny);
			session.persist(smith);
			session.persist(john);
			
			tx.commit();
			
			
			
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}

	}

}
