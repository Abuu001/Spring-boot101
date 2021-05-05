package com.lugonzo.Springboot101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot101Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot101Application.class, args);
		Customers cust =(Customers)context.getBean("customerBean");
		cust.display();
	}

}
