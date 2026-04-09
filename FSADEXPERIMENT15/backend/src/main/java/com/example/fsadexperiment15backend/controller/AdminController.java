package com.example.fsadexperiment15backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @PostMapping("/add")
    public ResponseEntity<String> addEmployee() {
        return ResponseEntity.ok("Employee added by admin");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee() {
        return ResponseEntity.ok("Employee deleted by admin");
    }
}
