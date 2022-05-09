package com.example.EventAgency.server.repository;

import com.example.EventAgency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
