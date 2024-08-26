package com.demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.jwt.util.JwtUser;
import com.demo.spring.jwt.util.JwtUtil;

@RestController
public class BaseController {
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JwtUtil jwtUtil;

	@GetMapping(path="/getmethod", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity methodGet() {
		return ResponseEntity.ok("Hello From Get Method");
	}
	
	@PostMapping(path="/postmethod/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity methodPost(@PathVariable("number") int number) {
		return ResponseEntity.ok("Hello From Post Method"+number);
	}
	
	@PostMapping(path="/authenticate",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody JwtUser jwtUser) {
		try {
			
			authManager.authenticate(new UsernamePasswordAuthenticationToken(jwtUser.getUsername(), jwtUser.getPassword()));
			
		} catch (Exception e) {
			return "invalid username/password";
		}
		
		String token =jwtUtil.generateToken(jwtUser.getUsername());
		return token;
	}
}
