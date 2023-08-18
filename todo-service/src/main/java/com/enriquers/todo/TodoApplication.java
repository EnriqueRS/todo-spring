package com.enriquers.todo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(TodoApplication.class).run(args);
	}

}
