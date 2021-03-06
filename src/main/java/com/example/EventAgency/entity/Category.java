package com.example.EventAgency.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(length=50, nullable = false)
    String name;
    @ManyToMany
    List<Costume> costumes;
    @ManyToMany
    List<Scenario> scenarios;
    @Column(length=500, nullable = false)
    String description;
}
