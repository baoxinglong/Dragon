package com.my.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = "com.my")
@ImportResource ({ "classpath:dubbo-consumer.xml" })
public class Entry2 {

	public static void main(String[] args) {
		SpringApplication.run(Entry2.class, args);
	}
}
