package com.example.EventAgency.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EventOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne(optional = false)
    Category category;
    @ManyToOne(optional = false)
    Category scenario;
    @ManyToOne(optional = false)
    User user;
    @ManyToMany
    List<Employee> employeeList;

    public EventOrder() {
        costumes = new ArrayList<>();

    }

    @ManyToMany
    List<Employee> costumes;
    @Column(nullable = false)
    Date date;
    @Column(nullable = false)
    Time time;
    @Column(length=255, nullable = false)
    String address;
    @ManyToOne(optional = false)
    Status status;
}
