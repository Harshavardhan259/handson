package com.demo.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.jwt.util.JwtUser;
import com.demo.spring.jwt.util.JwtUtil;

@RestController
public class Controller {
	
	@Autowired
	JwtUtil jwtUtil;
	
	@Autowired
	AuthenticationManager authManager;
	
	@GetMapping(path="/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getMethod() {
		return ResponseEntity.ok("Hello from Get Method");
	}
	
	@PostMapping(path="/authenticate",consumes =MediaType.APPLICATION_JSON_VALUE )
	public String login(@RequestBody JwtUser jwtUser) {
		try {
			
			authManager.authenticate(new UsernamePasswordAuthenticationToken(jwtUser.getUsername(), jwtUser.getPassword()));
		} catch (Exception e) {
			return "invalid username/password";
		}
		String token= jwtUtil.generateToken(jwtUser.getUsername());
		return token;
	}
	

}
