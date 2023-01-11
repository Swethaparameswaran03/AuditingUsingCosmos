package com.roms.auth.model;


import org.springframework.data.annotation.Id;



import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
@Container(containerName = "employee")

public class Employee extends Auditable<String> {
	@PartitionKey
	private String name;
	@Id
	private int id;
	
	private String dept;
	private double salary;
	
	


	

	

}