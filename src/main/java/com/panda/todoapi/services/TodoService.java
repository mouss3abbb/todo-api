package com.panda.todoapi.services;


import com.panda.todoapi.pojo.Todo;
import com.panda.todoapi.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    public List<Todo> getAll(){
        return todoRepository.findAll();
    }
    public Todo get(String id){
        return todoRepository.findById(id).get();
    }
    public void add(Todo todo){
        todoRepository.insert(todo);
    }

    public void delete(String id){
        todoRepository.deleteById(id);
    }
}
