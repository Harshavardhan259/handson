package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.EndUser;

@Repository
public interface EndUserRepository extends JpaRepository<EndUser, String> {

	public EndUser findByUsername(String username);
}
