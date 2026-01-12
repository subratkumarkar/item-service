package com.nextgen.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages= "com.nextgen.item")
@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class })
public class NextgenItemApplication {
	public static void main(String[] args) {
		SpringApplication.run(NextgenItemApplication.class, args);
	}
}