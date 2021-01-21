package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		System.out.println("inside sayHello method");
		return "Hello AWS";
	}
}
