package com.example.stud;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudRepository extends JpaRepository<Stud, Integer> {
    List<Stud> findAllByCourseId(Integer courseId);
}
