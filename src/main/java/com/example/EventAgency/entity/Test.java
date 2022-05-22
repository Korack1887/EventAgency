package com.example.EventAgency.entity;

public class Test implements TestInterface{
    @Override
    public String returnName(User user) {
        return user.name;
    }
}
