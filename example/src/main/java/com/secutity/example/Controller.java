package com.secutity.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	
	@GetMapping("/getall")
	public String getAllUsers() {
		return "user";
	}
	
	
	
}
