package com.roshni.rentcloud.configlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //getting ready to run the configuration
public class ConfigLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLocalApplication.class, args);
	}

}
