package com.demo.test.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
	
	@Given("create the object of Calculator")
	public void create_the_object_of_calculator() {
	   Calculator cal = new Calculator();
	}

	@When("I pass {int} and {int}")
	public void i_pass_and(Integer int1, Integer int2) {
	   System.out.println("params passed..");
	}

	@Then("add method should return {int}")
	public void add_method_should_return(Integer int1) {
	    assertEquals(7, int1);
	}
	
	@Then("divid method should return {int}")
	public void divid_method_should_return(Integer int1) {
		assertEquals(2, int1);
	    
	}
	
	@Then("sub method should return {int}")
	public void sub_method_should_return(Integer int1) {
		assertEquals(4, int1);
	}

	@Then("multi method should return {int}")
	public void multi_method_should_return(Integer int1) {
		assertEquals(16, int1);
	}


}
