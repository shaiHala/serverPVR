package com.projet.j2ee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("com.projet.j2ee.models")
@SpringBootApplication
public class ServerPvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerPvrApplication.class, args);
	}

}
