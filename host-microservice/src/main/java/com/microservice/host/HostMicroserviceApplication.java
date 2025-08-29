package com.microservice.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HostMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostMicroserviceApplication.class, args);
	}

}
