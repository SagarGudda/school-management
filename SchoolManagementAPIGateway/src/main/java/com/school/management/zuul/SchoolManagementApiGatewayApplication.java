package com.school.management.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;

@SpringBootApplication
@EnableEurekaClient
public class SchoolManagementApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApiGatewayApplication.class, args);
	}
	
	
	  @Bean public RouteLocator gatewayRoutes(RouteLocatorBuilder
	  routeLocatorBuilder) { return routeLocatorBuilder.routes()
	  .route(r->r.path("/**") .uri("http://localhost:8081/")) .build();
	  
	  }

	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
		return ServerCodecConfigurer.create();
	}
	 

}
