package com.demo.spring;

import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostClientSecured {

	public static void main(String[] args) {
		final String BASE_URL = "http://localhost:8080";

		RestTemplate restTemplate = new RestTemplate();
		EmpDTO empdata = new EmpDTO(127, "Dheeraj", "Bangalore", 9000.0);
		String credentials ="john:welcome1";
		String encryptedCredentials = new String(Base64.getEncoder().encode(credentials.getBytes()));
		System.out.println(encryptedCredentials);

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		headers.set("Authorization","Basic "+encryptedCredentials);

		HttpEntity<EmpDTO> req = new HttpEntity<>(empdata, headers);

		ResponseEntity<String> resp2 = restTemplate.exchange("http://localhost:8080/save", HttpMethod.POST, req,
				String.class);

		System.out.println(resp2.getBody());
	}
}
