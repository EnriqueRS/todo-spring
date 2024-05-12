package com.enriquers.todo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TodoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TodoApplication.class).run(args);
	}

}
