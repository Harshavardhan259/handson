package com.demo.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENTS")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	private String name;
	
	@ManyToMany
	@JoinTable(name ="STUDENTS_COURSES",joinColumns = {@JoinColumn(name= "STUDENTID")},inverseJoinColumns = {@JoinColumn(name="COURSEID")})
	private Set<Course> course = new HashSet<>();
	
	public Student() {
		
	}
	

	public Student(String name) {
		this.name = name;
	}


	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
}
