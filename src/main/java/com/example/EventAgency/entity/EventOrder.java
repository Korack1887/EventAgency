package com.example.EventAgency.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class EventOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @OneToOne
    Category category;
    @OneToOne
    User user;
    @ManyToMany
    List<Employee> employeeList;
    Timestamp datetime;
    String address;
}
