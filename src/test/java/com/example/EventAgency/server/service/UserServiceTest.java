package com.example.EventAgency.server.service;

import com.example.EventAgency.entity.User;
import com.example.EventAgency.server.repository.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService.UserRepository userService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<User> users = userService.findAll();
        System.out.println(users.get(0));
        Assert.assertEquals(users.get(0),1);
    }
}