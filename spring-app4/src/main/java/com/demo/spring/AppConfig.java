package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo.spring"})
public class AppConfig {

	@Bean
	public Name custName() {
		Name name  = new Name();
		name.setFirstName("harsh");
		name.setLastName("mane");
		return name;
	}
	
	@Bean
	public List<String> custEmail(){
		List<String> emails = new ArrayList<>();
		emails.add("harsha@gmail.com");
		return emails;
	}
}
