package com.demo.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Emp;
import com.demo.spring.repository.EmpRepository;
import com.demo.spring.util.Message;

@RestController
public class EmpRestController {

	@Autowired
	private EmpRepository empRepo;
	
	@PostMapping(path="/save" , produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> save(@RequestBody Emp e){
		
		if(empRepo.existsById(e.getEmpId())) {
			return ResponseEntity.ok(new Message("Emp Exists.."));
			
		}else {
			empRepo.save(e);
			return ResponseEntity.ok(new Message("Emp Exists.."));
			
		}
	}
	
	@GetMapping(path="/find/{empId}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findOne(@PathVariable("empId") String id){
		Optional<Emp> e = empRepo.findById(id);
		if(e.isPresent()) {
			return ResponseEntity.ok(e.get());
			
		}else {
			return ResponseEntity.ok(new Message("Emp Not  Exists.."));
			
		}
	}
	
	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> listEmp() {
		return ResponseEntity.ok(empRepo.findAll());
	}
	
	@PatchMapping(path="/update/{empId}/{salary}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> updateEmp(@PathVariable("empId") String empId, @PathVariable("salary") Double salary){
		
		if(empRepo.existsById(empId)) {
			empRepo.updateSalary(empId, salary);
			return ResponseEntity.ok(new Message("Employee salary updated"));
			
		}else {
			return ResponseEntity.ok(new Message("Employee not Exists"));
		}
		
	}
}
