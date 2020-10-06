package com.ist.alrajhi.ivr.operations_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ist.alrajhi.ivr.operations_portal")
public class OperationsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationsPortalApplication.class, args);
	}

}
