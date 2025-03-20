package com.akhil.myproject1.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {
	
	@GetMapping(path = "/wellcome")
	public String getUsers() {
		return "Hi Akhil, Wellcome to Spring Security Demo.";
	}

}
