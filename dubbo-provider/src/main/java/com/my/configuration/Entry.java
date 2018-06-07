package com.my.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers.xml"})
public class Entry {

	public static void main(String[] args) {
		SpringApplication.run(Entry.class, args);
	}
}
