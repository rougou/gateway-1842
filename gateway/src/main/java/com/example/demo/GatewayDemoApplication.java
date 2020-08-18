package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayDemoApplication {

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		String uri = "lb://myapi";

		return builder.routes()
			.route(p -> p.path("/**")
				.uri(uri)
				.id("myapi"))
			.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayDemoApplication.class, args);
	}
}
