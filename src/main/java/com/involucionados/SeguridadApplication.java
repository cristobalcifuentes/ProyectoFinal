package com.involucionados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
public class SeguridadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguridadApplication.class, args);
	}
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/inicio").setViewName("inicio");
	}

	
}
