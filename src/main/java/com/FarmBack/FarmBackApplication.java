package com.FarmBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.FarmBack.Repositories")
public class FarmBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmBackApplication.class, args);
	}
}
