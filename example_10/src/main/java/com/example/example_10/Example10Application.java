package com.example.example_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// exclude parameter is used to exclude the auto-configuration of DataSource
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Example10Application {

	public static void main(String[] args) {
		SpringApplication.run(Example10Application.class, args);

	}

}
