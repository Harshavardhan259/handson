package com.demo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.entity.EndUsers;

public interface EndUserRepository extends JpaRepository<EndUsers, String> {
	
	public EndUsers findByUsername(String username);

}
