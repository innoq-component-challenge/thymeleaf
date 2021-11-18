package com.challenge.thymeleaf;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ComponentChallengeThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentChallengeThymeleafApplication.class, args);
	}

	@Bean
	public LayoutDialect LayoutDialect() {
		return new LayoutDialect();
	}
}
