package com.example.EventAgency.entity;

import javax.persistence.*;

@Entity
public class Costume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int amount;
}
