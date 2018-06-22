package com.javalogbook.springboot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javalogbook.springboot")
public class SpringBootMVCApplicationStarter {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMVCApplicationStarter.class, args);
	}
}
