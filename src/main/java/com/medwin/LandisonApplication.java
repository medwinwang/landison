package com.medwin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LandisonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandisonApplication.class, args);
	}
}
