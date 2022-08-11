package com.example.convertion.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.convertion.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}