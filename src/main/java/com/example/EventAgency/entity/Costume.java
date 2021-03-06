package com.example.EventAgency.entity;

import javax.persistence.*;

@Entity
public class Costume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(length = 50, nullable = false)
    String name;
    @Column(nullable = false)
    int amount;
    @Column(length = 500, nullable = false)
    String description;
    @Column(nullable = false)
    float price;
}
