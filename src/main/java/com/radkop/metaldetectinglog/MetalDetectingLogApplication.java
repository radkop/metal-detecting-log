package com.radkop.metaldetectinglog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MetalDetectingLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetalDetectingLogApplication.class, args);
	}

}
