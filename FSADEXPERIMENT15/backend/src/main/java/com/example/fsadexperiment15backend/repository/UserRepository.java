package com.example.fsadexperiment15backend.repository;

import com.example.fsadexperiment15backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
