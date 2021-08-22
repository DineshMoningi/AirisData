package com.airisdata.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.airisdata.entity")
@ComponentScan(basePackages = {"com.airisdata.controller", "com.airisdata.service"})
@EnableJpaRepositories("com.airisdata.repository")
public class StudentAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppDemoApplication.class, args);
	}

}
