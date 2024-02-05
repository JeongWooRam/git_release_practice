package com.example.git_release_practice.repository;

import com.example.git_release_practice.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findById(Long id);
    User findByName(String name);
}
