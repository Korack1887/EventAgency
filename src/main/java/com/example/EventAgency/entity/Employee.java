package com.example.EventAgency.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String name;
    @ManyToMany
    List<Category> categoryList;
}
