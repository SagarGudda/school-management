package com.school.management.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TeacherserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherserviceApplication.class, args);
	}
	
	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder
	 * restTemplateBuilder) { return restTemplateBuilder.build(); }
	 */

}
