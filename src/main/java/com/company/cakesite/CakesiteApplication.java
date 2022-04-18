package com.company.cakesite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CakesiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CakesiteApplication.class, args);
	}

}
