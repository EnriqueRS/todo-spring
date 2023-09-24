package com.enriquers.todo.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
public class MainController {

  @GetMapping("/{todoId}")
  @ResponseStatus(HttpStatus.OK)
  public String getToDo(@PathVariable String todoId) {
    return "Hello World " + todoId;
  }

}
