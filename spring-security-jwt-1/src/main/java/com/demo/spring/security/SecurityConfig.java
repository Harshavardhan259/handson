package com.demo.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.demo.spring.jwt.util.JwtFilter;
import com.demo.spring.repository.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	CustomUserDetailsService userDetails;
	
	@Autowired
	JwtFilter filter;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.antMatchers("/authenticate")
		.permitAll().anyRequest()
		.authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().exceptionHandling().and()
		.csrf()
		.disable().httpBasic();
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
		
	}
	
	/*
	 * @Bean public JdbcUserDetailsManager userDetailsManager() {
	 * JdbcUserDetailsManager userdetails = new JdbcUserDetailsManager(ds); return
	 * userdetails; }
	 */
	
	@Autowired
	public void UserdetailsService(AuthenticationManagerBuilder authBuilder) throws Exception {
		authBuilder.userDetailsService(userDetails);
	}
	
	@Bean
	public AuthenticationManager authManeeger(AuthenticationConfiguration authConfig) throws Exception {
		AuthenticationManager auth = authConfig.getAuthenticationManager();
		return auth;
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	
}
