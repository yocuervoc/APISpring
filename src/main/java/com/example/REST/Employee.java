package com.example.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Employee {
	
	//@GetMapping
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
}
