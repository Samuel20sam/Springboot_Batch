package com.bridgelabz.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerContactBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerContactBatchApplication.class, args);
		System.out.println("\n < ------ Customer Contact Batch Application Launched ------ > \n");
	}
}