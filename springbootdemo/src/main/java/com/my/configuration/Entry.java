package com.my.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.my")
@EnableScheduling
public class Entry {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(Entry.class,args);
    }
}
