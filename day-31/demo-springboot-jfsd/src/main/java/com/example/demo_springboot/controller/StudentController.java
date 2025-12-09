package com.example.demo_springboot.controller;

import com.example.demo_springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    List<Student> students = Arrays.asList(
            new Student(1, "John", "Doe"),
            new Student(2, "Peter", "Doe"),
            new Student(3, "Jane", "Doe")
    );

    @GetMapping("student")
    public ResponseEntity<Student> getStudent() {
        return ResponseEntity.ok()
                .header("custom-header", "from java")
                .body(students.get(0));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(students);
    }

    //    /query?id=1&name=john -> query parameter
    @GetMapping("query")
    public ResponseEntity<Student> getStudentByRequestVariable(@RequestParam int id) {
        return ResponseEntity.ok(students.get(id));
    }

    //    /1/john-> path parameter
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentByPathVariable(@PathVariable("id") int id) {
        return ResponseEntity.ok(students.get(id));
    }

    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
        System.out.println(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {
        System.out.println(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.NO_CONTENT);
    }

}
