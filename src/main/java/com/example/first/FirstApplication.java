package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstApplication {

	@Bean
	public Runnable createRunnable(){
		return () -> {
			System.out.println("spring boot is run");
		};
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
}
