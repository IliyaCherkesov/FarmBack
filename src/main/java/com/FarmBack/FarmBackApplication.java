package com.FarmBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
public class FarmBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmBackApplication.class, args);
	}
}
