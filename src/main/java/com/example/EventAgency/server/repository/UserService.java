package com.example.EventAgency.server.repository;

import com.example.EventAgency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserService {
    public interface UserRepository extends JpaRepository<User, Integer> {
    }
    UserRepository userRepository;
    public User getUserWithNameTest(){
        return userRepository.findAll().stream().filter(user -> user.getName().equals("Test")).findFirst().get();
    }
}
