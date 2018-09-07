package com.nestorms.saludoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.nestorms.saludoclient")
public class SaludoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaludoClientApplication.class, args);
	}
}
