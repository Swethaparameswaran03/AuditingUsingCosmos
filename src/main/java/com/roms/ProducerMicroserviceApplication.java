package com.roms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.spring.data.cosmos.core.mapping.EnableCosmosAuditing;

 

@SpringBootApplication
@EnableCosmosAuditing
public class ProducerMicroserviceApplication {

		public static void main(String[] args) {
			SpringApplication.run(ProducerMicroserviceApplication.class, args);
		}
	}