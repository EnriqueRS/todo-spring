package com.enriquers.todo.repository;

import com.enriquers.todo.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<ToDo, String> {

}
