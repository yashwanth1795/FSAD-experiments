package com.example.fsadexperiment14backend.repository;

import com.example.fsadexperiment14backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
