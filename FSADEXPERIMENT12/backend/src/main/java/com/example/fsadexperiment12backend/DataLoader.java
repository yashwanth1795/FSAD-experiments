package com.example.fsadexperiment12backend;

import com.example.fsadexperiment12backend.model.Student;
import com.example.fsadexperiment12backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student("Alice", "alice@example.com", "CS"));
        studentRepository.save(new Student("Bob", "bob@example.com", "IT"));
        studentRepository.save(new Student("Charlie", "charlie@example.com", "AI"));
    }
}
