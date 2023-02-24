package com.panda.todoapi.repositories;


import com.panda.todoapi.pojo.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,String> {

}
