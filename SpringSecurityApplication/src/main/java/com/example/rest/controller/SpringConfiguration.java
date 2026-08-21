package com.example.rest.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> {
			csrf.disable();
		});
		
	
		http.authorizeHttpRequests(auth -> {
		auth.requestMatchers("/page/user").permitAll();
		auth.requestMatchers("/page/admin").authenticated();
	    });
		
		http.httpBasic(httpBasic -> {
			
		});
		
		return http.build();
	}

}
