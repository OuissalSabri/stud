package com.example.stud;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class StudService {
    private final StudRepository repository;

    public void saveStudent(Stud student){
        repository.save(student);
    }

    public List<Stud> findAllStudents(){
        return repository.findAll();
    }

    public List<Stud> findAllStudentsByCourse(Integer courseId) {
        return repository.findAllByCourseId(courseId);
    }
}
