package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo.spring"})
public class AppConfig {
	
	public Trainer trainer1(String name) {
		Trainer name1 = new Trainer();
		name1.setName(name);
		return name1;
		
	}
	
	@Bean
	public List<Participant> participantList(){
		List<Participant> partList = new ArrayList<>();
		LunchBox box1 =new LunchBox("Raice", "dal");
		partList.add(new Participant("john", box1));
		partList.add(new Participant("jenny", new LunchBox("Chappati", "dal")));
		partList.add(new Participant("peter", new LunchBox("Raice", "Chappati")));
		return partList;
	}
	
	@Bean
	public String trainerName() {
		return "peter";
	}
	
}
