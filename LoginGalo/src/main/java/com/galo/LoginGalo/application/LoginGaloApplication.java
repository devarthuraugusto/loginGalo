package com.galo.LoginGalo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.galo"})
public class LoginGaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginGaloApplication.class, args);
	}

}
