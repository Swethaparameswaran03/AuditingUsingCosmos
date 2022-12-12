package com.roms.auth.repository;


import org.springframework.stereotype.Repository;
import com.roms.auth.model.Employee;
import com.azure.cosmos.models.PartitionKey;
import com.azure.spring.data.cosmos.repository.CosmosRepository;


@Repository
public interface EmployeeRespository extends CosmosRepository<Employee,String> {



	

}
