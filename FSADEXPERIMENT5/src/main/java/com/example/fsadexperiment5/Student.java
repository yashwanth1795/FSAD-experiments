package com.example.fsadexperiment5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    private String name;
    private String gender;
    @Autowired
    private Certification certification;

    public Student() {
        this.id = 101;
        this.name = "John Doe";
        this.gender = "Male";
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public Certification getCertification() { return certification; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', gender='" + gender + "', certification=" + certification + "}";
    }
}
