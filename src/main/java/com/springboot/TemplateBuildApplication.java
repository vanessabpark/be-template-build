package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TemplateBuildApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateBuildApplication.class, args);
	}

}
