package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeRest {
	
	//@GetMapping
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
	@RequestMapping(value="yonatan", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployee(){
		return null;
		//return ResponseEntity.ok();
	}
}
