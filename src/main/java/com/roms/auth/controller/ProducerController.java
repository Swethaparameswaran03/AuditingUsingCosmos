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
import com.roms.auth.repository.EmployeeRespository;
import com.roms.auth.service.EmployeeService;




@RestController
public class ProducerController {
	
	@Autowired
	private EmployeeService emp;
	
	@Autowired
	private EmployeeRespository repo;
	
	 public ProducerController() throws Exception {
	    }
	 
	
    @PostMapping("employee")
	public 	ResponseEntity<Employee> savedEmployee(@RequestBody Employee employee)
	{
		Employee e=emp.save(employee);
		return new ResponseEntity<>(e,HttpStatus.OK);
	
		
	}
	@GetMapping("employee/{empId}")
    public ResponseEntity<Employee> getEmpId(
    		@PathVariable("empId") String empId) throws UserNullException{
		return new ResponseEntity<>(emp.getempId(empId),HttpStatus.OK);

    }
	@DeleteMapping("employee/{empId}")
    public ResponseEntity<String> deleteExistingCustomer( 
    		@PathVariable("empId") String empId) throws UserNullException {
       emp.delete(empId);
        return new ResponseEntity<String>("Employee with Id " + empId + " is deleted successfully", HttpStatus.OK);
        
    }
 @PutMapping("employee")
    public ResponseEntity<Employee> updateExistingCustomer(@RequestBody Employee c) throws UserNullException {

     Employee e=emp.update(c);
		return new ResponseEntity<>(e,HttpStatus.OK);
    }
	


}