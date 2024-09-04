package com.lit.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(CustomerApplication.class);

	public static void main(String[] args) {
		logger.info("\n\n\nStarting Customer Application\n\n\n");
		SpringApplication.run(CustomerApplication.class, args);
	}

}
