package com.example.fsadexperiment5;

import org.springframework.stereotype.Component;

@Component
public class Certification {
    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 1;
        this.name = "Java Certification";
        this.dateOfCompletion = "2023-12-01";
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDateOfCompletion() { return dateOfCompletion; }

    @Override
    public String toString() {
        return "Certification{id=" + id + ", name='" + name + "', dateOfCompletion='" + dateOfCompletion + "'}";
    }
}
