package com.demo.builder.ex1;

public class BuilderMain {

	public static void main(String[] args) {
		User user = new User.UserBuilder(123, "name").build();
		
		User user1 = new User.UserBuilder(120, "john").email("jhon@gmail.com").city("london").build();
		
		
		StringBuilder stringBuilder= new StringBuilder();
		stringBuilder.append("Harsh").append(" mane ").append(63619282);
		
		System.out.println(stringBuilder);
		
		Email email = new Email.EmailBuilder("harsh")
				.setSentFrom("test@gamil.com")
				.setSentTo("mail@gmail.com")
				.setSubject("Test with only required fields")
				.setContent("requisted field test ").build();
		
		
	}

}
