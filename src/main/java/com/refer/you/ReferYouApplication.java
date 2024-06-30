package com.refer.you;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ReferYouApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferYouApplication.class, args);
	}

}
