package com.my.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers1.xml"})
public class Entry1 {

	public static void main(String[] args) {
		SpringApplication.run(Entry1.class, args);
	}
}
