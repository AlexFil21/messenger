package com.messenger.revolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.messenger.revolution.data.repository")
@EntityScan("com.messenger.revolution.data.entities")
public class RevolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevolutionApplication.class, args);
	}

}
