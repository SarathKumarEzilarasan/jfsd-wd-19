package com.example.todo_management.controller;

import com.example.todo_management.dto.TodoDto;
import com.example.todo_management.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto) {
        TodoDto savedTodoDto = todoService.addTodo(todoDto);
        return new ResponseEntity<>(savedTodoDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@RequestParam("id") Long id) {
        TodoDto todoDto = todoService.getTodo(id);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos() {
        List<TodoDto> todoDto = todoService.getAllTodos();
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }


    @PutMapping("{id}")
    public ResponseEntity<TodoDto> createTodo(@RequestBody TodoDto todoDto, @RequestParam("id") Long id) {
        TodoDto updatedTodoDto = todoService.updateTodo(todoDto, id);
        return new ResponseEntity<>(updatedTodoDto, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTodo(@RequestParam("id") Long id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }

    @PatchMapping("{id}/complete")
    public ResponseEntity<TodoDto> completeTodo(@RequestParam("id") Long id) {
        TodoDto updatedTodoDto = todoService.completeTodo(id);
        return new ResponseEntity<>(updatedTodoDto, HttpStatus.OK);
    }

    @PatchMapping("{id}/in-complete")
    public ResponseEntity<TodoDto> incompleteTodo(@RequestParam("id") Long id) {
        TodoDto updatedTodoDto = todoService.incompleteTodo(id);
        return new ResponseEntity<>(updatedTodoDto, HttpStatus.OK);
    }

}
