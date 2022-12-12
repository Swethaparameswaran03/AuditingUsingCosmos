package com.roms.auth.service;



import com.roms.auth.controller.UserNullException;
import com.roms.auth.model.Employee;


public interface EmployeeService {
	
	Employee save(Employee emp);
	
	Employee getempId(String id) throws UserNullException;
	
	public void delete(String id) throws UserNullException;
	
	public Employee update(Employee emp) throws UserNullException  ;


}
