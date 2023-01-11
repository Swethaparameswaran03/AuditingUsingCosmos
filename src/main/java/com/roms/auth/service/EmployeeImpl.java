package com.roms.auth.service;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.roms.auth.model.Employee;
import com.roms.auth.model.InputRequest;
import com.roms.auth.repository.EmployeeRespository;



@Service
@Component
public class EmployeeImpl{
	
	@Autowired
	private EmployeeRespository repo;
	

	public String saveEmployee(InputRequest<Employee> request) {
		String currentUser = request.getLoggedInUser();
		request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
		Employee employee = request.getEmployee();
		employee.setCreatedBy(currentUser);
		repo.save(employee);
		return "Employee saved successfully...";

	}

public String updateEmployee(int id, double salary, InputRequest<Employee> request) {
	Employee employee = repo.findById(id).get();
	if (employee != null) {
		employee.setSalary(salary);
		employee.setModifiedBy(request.getLoggedInUser());
		repo.save(employee);
	} else {
		throw new RuntimeException("Employee not found with id : " + id);
	}
	return "Employee Updated successfully ";
}

}
