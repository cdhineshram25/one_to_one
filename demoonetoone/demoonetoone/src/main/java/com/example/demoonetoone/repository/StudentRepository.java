package com.example.demoonetoone.repository;

import com.example.demoonetoone.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
