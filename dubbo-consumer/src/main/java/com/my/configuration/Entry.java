package com.my.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.my")
@ImportResource ({ "classpath:dubbo-consumer.xml" })
public class Entry {

	public static void main(String[] args) {
		SpringApplication.run(Entry.class, args);
	}
}
