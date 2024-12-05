package com.springboot.project.repository;

import com.springboot.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Object> findByEmail(String email);
}
