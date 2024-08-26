package com.demo.spring;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.spring.entity.Emp;
import com.demo.spring.repository.EmpRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	MockMvc mvc;
	
	@MockBean
	EmpRepository empRepo;
	
	@Test
	public void testfind()  throws Exception{
		when(empRepo.findById(102)).thenReturn(Optional.of(new Emp(102, "harsh", "bhoj", 45000.0)));
		mvc.perform(get("/find/102"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(jsonPath("$.name").value("harsh"));
	}
	
	@Test
	public void testSaveEmp()  throws Exception{
		Emp emp =new Emp(102, "harsh", "bhoj", 45000.0);
		ObjectMapper mapper =new ObjectMapper();
		String empJson = mapper.writeValueAsString(emp);
		when(empRepo.existsById(102)).thenReturn(false);
		mvc.perform(post("/save").content(empJson).contentType(MediaType.APPLICATION_JSON_VALUE))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(jsonPath("$.status").value("Emp data saved.."));
	}
	@Test
	public void testUpdatedEmp()  throws Exception{
		
		when(empRepo.existsById(102)).thenReturn(true);
		when(empRepo.updateSalary(102, 50000)).thenReturn(1);
		mvc.perform(patch("/update1/102/50000"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(jsonPath("$.status").value("Emp is updated.."));
	}
	
	@Test
	public void testListEmp()  throws Exception{
		
		when(empRepo.findAll()).thenReturn(null);

		mvc.perform(get("/list"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(jsonPath("$.status").value("Emp is updated.."));
	}
	
	
	

}
