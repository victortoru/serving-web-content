package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ServingWebContentApplication {
List <String> names;
	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}

	@Bean
	public List <String> lista(){
	return new ArrayList<String>();
	}
}