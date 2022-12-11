package com.formacionbdi.springboot.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServicioGetawayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioGetawayServerApplication.class, args);
	}

}
