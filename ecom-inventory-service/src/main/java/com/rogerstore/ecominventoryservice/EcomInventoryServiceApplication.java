package com.rogerstore.ecominventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EcomInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomInventoryServiceApplication.class, args);
	}

}
