package com.demo.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getMethod() {
		return ResponseEntity.ok("Hello from Get Method");
	}
	

}
