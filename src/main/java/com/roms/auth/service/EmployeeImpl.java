package com.roms.auth.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.azure.cosmos.implementation.NotFoundException;
import com.azure.cosmos.models.PartitionKey;
import com.roms.auth.controller.UserNullException;
import com.roms.auth.model.Employee;
import com.roms.auth.repository.EmployeeRespository;



@Service
@Component
public class EmployeeImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRespository repo;
	
	@Override
	public Employee save(Employee emp)
	{
		return repo.save(emp);
		
	}

	@Override
	public Employee getempId(String id) throws UserNullException  {
		// TODO Auto-generated method stub
		Optional<Employee> optionalProduct = repo.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		} 
		else
		{
			throw new UserNullException("Employee with Id : " + id +"not found");
		}
	}

	public void delete(String id) throws UserNullException
	{
	Employee emp=this.getempId(id);
	   repo.deleteById(id);
	  
	}
	public Employee update(Employee emp) throws UserNullException  {
		this.getempId(emp.getId());
		return repo.save(emp);
	}

}
