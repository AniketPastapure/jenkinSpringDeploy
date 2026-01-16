package com.example.jenkin.jenkinSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class jenkinController {
  
	@GetMapping("/name")
	public String getName() {
		return "Hello World";
	}
}
