package com.alvin.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "com.alvin")
@MapperScan(basePackages = "com.alvin.demo.mapper")
@PropertySource("classpath:datasource.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}