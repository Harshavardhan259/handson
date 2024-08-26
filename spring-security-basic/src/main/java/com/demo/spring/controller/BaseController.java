package com.demo.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping(path="/getmethod", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity methodGet() {
		return ResponseEntity.ok("Hello From Get Method");
	}
	
	@PostMapping(path="/postmethod/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity methodPost(@PathVariable("number") int number) {
		return ResponseEntity.ok("Hello From Post Method"+number);
	}
}
