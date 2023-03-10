package com.school.management.classroutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ClassRoutineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassRoutineServiceApplication.class, args);
	}

}
