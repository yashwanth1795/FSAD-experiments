package com.example.fsadexperiment12backend.repository;

import com.example.fsadexperiment12backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
