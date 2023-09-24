package com.enriquers.todo.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/todo")
@RequiredArgsConstructor
public class MainController {

  @GetMapping("/{todoId}")
  @ResponseStatus(HttpStatus.OK)
  public String getToDo() {
    return "Hello World";
  }

}
