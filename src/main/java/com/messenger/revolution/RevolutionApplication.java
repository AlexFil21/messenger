package com.messenger.revolution;

import com.messenger.data.dto.AttachmentsDTO;
import com.messenger.data.entities.Attachments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.zip.DataFormatException;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.messenger.data.repository")
@EntityScan("com.messenger.data.entities")
public class RevolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevolutionApplication.class, args);
	}

}
