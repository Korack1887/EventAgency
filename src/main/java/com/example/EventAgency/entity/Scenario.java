package com.example.EventAgency.entity;

import javax.persistence.*;

@Entity
public class Scenario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(length=100, nullable = false)
    String name;
    @Column(length=1000, nullable = false)
    String description;
    @Column(nullable = false)
    float price;
}
