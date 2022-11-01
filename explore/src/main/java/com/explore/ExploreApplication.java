package com.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ExploreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreApplication.class, args);
	}

}
