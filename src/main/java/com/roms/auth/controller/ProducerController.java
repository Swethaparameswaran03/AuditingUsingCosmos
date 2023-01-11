package com.roms.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roms.auth.model.Employee;
import com.roms.auth.model.InputRequest;
import com.roms.auth.repository.EmployeeRespository;
import com.roms.auth.service.EmployeeImpl;




@RestController
public class ProducerController {
	
	@Autowired
	private EmployeeImpl emp;
	
	@Autowired
	private EmployeeRespository repo;
	
	 public ProducerController() throws Exception {
	    }
	
	 @PostMapping("employee")
	    public String saveEmployee(@RequestBody InputRequest<Employee> request) {
			return emp.saveEmployee(request);
		}
	    
    @PutMapping("/updateEmployee/{id}/{salary}")
	    public String updateEmployee(@PathVariable int id,@PathVariable double salary, @RequestBody InputRequest<Employee> request) {
		return emp.updateEmployee(id,salary,request);
	}
	

	



}