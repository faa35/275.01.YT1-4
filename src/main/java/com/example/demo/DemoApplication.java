package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This is a Spring Boot application that we are about to write
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); //demoApplication is the application that we are currently creating
	}
	// later we will add some controllers and modelling classes to this application

	// now this application will look for webpages to display
	// there are two ways to do this
	// 1. using templates
	// 2. using static webpages
	

}
