package com.enriquers.todo.controller;

import com.enriquers.todo.model.ToDo;
import com.enriquers.todo.repository.TodoRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RefreshScope
@RequestMapping("api/v1/todos")
public class ToDoController {

  private final TodoRepository todoRepository;

  @Value("${todo.test}")
  private String test;

  @GetMapping("/test-property")
  public String testProperty() {
    return test;
  }

  @GetMapping("")
  @ResponseStatus(HttpStatus.OK)
  public List<ToDo> getAllKids() {
    return todoRepository.findAll();
  }

  @PostMapping("")
  @ResponseStatus(HttpStatus.CREATED)
  public void createToDo(ToDo toDo) {

  }

}
