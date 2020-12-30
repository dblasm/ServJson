package com.cmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServicioJsonApplication {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication (ServicioJsonApplication.class);	
		sa.run(args);
	}
	


}
