package com.example.stud;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudController {

    private final StudService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Stud student
    ){
        service.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Stud>> findAllStudents(){
        return ResponseEntity.ok(service.findAllStudents());
    }

    @GetMapping("/course/{course-id}")
    public ResponseEntity<List<Stud>> findAllStudents(
            @PathVariable("course-id") Integer courseId
    ){
        return ResponseEntity.ok(service.findAllStudentsByCourse(courseId));
    }


}
