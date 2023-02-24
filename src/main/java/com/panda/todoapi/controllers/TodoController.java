package com.panda.todoapi.controllers;


import com.panda.todoapi.pojo.Todo;
import com.panda.todoapi.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos/")
public class TodoController {
    @Autowired
    TodoService todoService;
    @GetMapping(value = {"get-all","get-all/"})
    public ResponseEntity<List<Todo>> getAllTodos(){
        return new ResponseEntity<>(todoService.getAll(),HttpStatus.OK);
    }

    @GetMapping(value = {"get/{id}"})
    public ResponseEntity<Todo> getById(@PathVariable String id){
        return new ResponseEntity<>(todoService.get(id),HttpStatus.OK);
    }

    @PostMapping(value = {"add-todo","add-todo/"})
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        todoService.add(todo);
        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }

    @DeleteMapping(value = {"delete/{id}","delete/{id}/"})
    public ResponseEntity<Void> deleteTodo(@PathVariable String id){
        todoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
