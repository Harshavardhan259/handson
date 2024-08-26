package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostClient {

	public static void main(String[] args) {
		final String BASE_URL = "http://localhost:8080";

		RestTemplate restTemplate = new RestTemplate();

		EmpDTO empdata = new EmpDTO(200, "Dheeraj", "Bangalore", 9000.0);
		EmpDTO empdata2 = new EmpDTO(201, "Ittapa", "Bangalore", 9000.0);

		String response = restTemplate.postForObject(BASE_URL+"/save",empdata, String.class);

		System.out.println(response);


		// Exchange starts

		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);

		HttpEntity<EmpDTO> req = new HttpEntity<>(empdata2, headers);

		ResponseEntity<String> resp2 = restTemplate.exchange("http://localhost:8080/save", HttpMethod.POST, req,
				String.class);

		System.out.println(resp2.getBody());
	}
}
