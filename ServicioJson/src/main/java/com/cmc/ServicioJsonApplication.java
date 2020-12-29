package com.cmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ServicioJsonApplication {
	
	//@Override extends SpringBootServletInitializer
    //protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    //    return application.sources(ServicioJsonApplication.class);
    //}
	
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication (ServicioJsonApplication.class);	
		sa.run(args);
	}
	


}
