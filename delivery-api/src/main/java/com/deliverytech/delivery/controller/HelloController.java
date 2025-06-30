package com.deliverytech.delivery.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController{
	
	@GetMapping("/")
	public String hello(){
		return "Olá mundo do Spring Boot do Bil!!!";
	}
	
	@GetMapping("/api/status")
	public String status(){
		return "<h1>Aplicação funcionando!</h1>";
	}
	
}