package com.capgemini.mentoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MentoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentoriaApplication.class, args);

	}

}
