package com.klu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Course;
import com.klu.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

   
    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        return new ResponseEntity<>(service.addCourse(course), HttpStatus.CREATED);
    }

    
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        return new ResponseEntity<>(service.getAllCourses(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable int id) {
        Optional<Course> course = service.getCourseById(id);

        if(course.isPresent()) {
            return new ResponseEntity<>(course.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>("Course Not Found", HttpStatus.NOT_FOUND);
    }

 
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable int id, @RequestBody Course course) {
        Optional<Course> existing = service.getCourseById(id);

        if(existing.isPresent()) {
            return new ResponseEntity<>(service.updateCourse(id, course), HttpStatus.OK);
        }
        return new ResponseEntity<>("Course Not Found", HttpStatus.NOT_FOUND);
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable int id) {
        Optional<Course> existing = service.getCourseById(id);

        if(existing.isPresent()) {
            service.deleteCourse(id);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Course Not Found", HttpStatus.NOT_FOUND);
    }

  
    @GetMapping("/search/{title}")
    public ResponseEntity<?> searchCourse(@PathVariable String title) {
        List<Course> courses = service.searchByTitle(title);

        if(courses.isEmpty()) {
            return new ResponseEntity<>("No Courses Found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
}