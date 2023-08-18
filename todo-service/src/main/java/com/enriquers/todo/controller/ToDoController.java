package com.enriquers.todo.controller;

import com.enriquers.todo.model.ToDo;
import com.enriquers.todo.repository.TodoRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("api/v1/todos")
public class ToDoController {

  private final TodoRepository todoRepository;

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
