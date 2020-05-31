package com.example.demo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeRest {
	
	@Autowired //esto es una injeccion de dependencia
	private EmployeeDAO employeeDAO;
	
	
	//@GetMapping
	@RequestMapping(value="hello", method = RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
	@GetMapping
	//@RequestMapping(value="employees", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> employee =  employeeDAO.findAll();
		return ResponseEntity.ok(employee);
	}
	
	@RequestMapping(value="{employeesId}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeebyId(@PathVariable("employeesId") Long id){
		java.util.Optional<Employee> employee =  employeeDAO.findById(id);
		if(employee.isPresent()) {
			return ResponseEntity.ok(employee.get());
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	@RequestMapping(value="create", method = RequestMethod.POST)
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		
		System.out.println(employee.getBirthDate());
		LocalDate today = LocalDate.now(); 
		LocalDate birthDay = LocalDate.of(employee.getBirthDate().get(Calendar.YEAR), employee.getBirthDate().get(Calendar.MONTH)+1, employee.getBirthDate().get(Calendar.DAY_OF_MONTH)); 
		Period age = Period.between(birthDay, today);
		
		System.out.println(age);
		if(age.getYears()>=18) {
			Employee newEmployee= employeeDAO.save(employee);
			return ResponseEntity.ok(newEmployee);
		}else {
			return new ResponseEntity("Employee must be at least 18 years old",  HttpStatus.BAD_REQUEST); 
		}
		
	}
}
/*
insert into employees values(1, "Cuervo", '1992-04-20', "1101176784",  '2020-06-01',"Yonatan", "developer", 2350000);
insert into employees values(2, "Rodriguez", '1992-04-20', "1101176784",  '2020-06-01',"Yeimy", "Contadora", 2350000);

*/
