package com.demo.spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.entity.Emp;
import com.demo.spring.exception.EmpNotFoundException;
import com.demo.spring.repository.EmpRepository;
import com.demo.spring.util.Message;

@RestController
public class EmpRestController {
	@Autowired
	EmpRepository empRepository;

	// find/100-->empId=100
	// @RequestMapping(path="/find/{empId}", method = RequestMethod.GET)
	@GetMapping(path = "/find/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findOneEmp(@PathVariable("empId") int id) {
		System.out.println(empRepository.getClass().getName());
		Optional<Emp> empOp = empRepository.findById(id);
		if (empOp.isPresent()) {
			return ResponseEntity.ok(empOp.get());
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Message("Emp Not Found for " + id));
		}
	}

	@PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> save(@RequestBody Emp e) {

		if(empRepository.existsById(e.getEmpId())) {
			return ResponseEntity.ok(new Message("Emp alredy exists"));
		}else {
			empRepository.save(e);
			return ResponseEntity.ok(new Message("Emp data saved.."));
		}
	}

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> getEmpList() {
		return ResponseEntity.ok(empRepository.findAll());

	}
	
	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> delete(@RequestBody Emp e) {
		if(empRepository.existsById(e.getEmpId())) {
			empRepository.delete(e);
			return ResponseEntity.ok(new Message("Emp data deleted"));
		}else {
			
			return ResponseEntity.ok(new Message("Emp Not fund.."));
		}
	}
	@PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> update(@RequestBody Emp e) {
		if(empRepository.existsById(e.getEmpId())) {
			empRepository.save(e);
			return ResponseEntity.ok(new Message("Emp is updated.."));
		}else {
			return ResponseEntity.ok(new Message("Emp data deleted.."));
		}
	}
	
	@PatchMapping(path = "/update1/{empId}/{salary}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Message> update1(@PathVariable("empId") int empId ,@PathVariable("salary") int salary ) {
		if(empRepository.existsById(empId)) {
			
			empRepository.updateSalary(empId,salary);
			return ResponseEntity.ok(new Message("Emp is updated.."));
		}else {
			return ResponseEntity.ok(new Message("Emp Does Not Exist.."));
		}
	}
	
	@ExceptionHandler(EmpNotFoundException.class)
	public ResponseEntity<Message> handleEmpNotFound(EmpNotFoundException ex){
		return ResponseEntity.ok(new Message("Emp not Found"));
	}

}
