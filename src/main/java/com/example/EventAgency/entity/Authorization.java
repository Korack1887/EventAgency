package com.example.EventAgency.entity;

import javax.persistence.*;
@Entity
public class Authorization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(length=50, nullable = false)
    String login;
    @Column(length=50, nullable = false)
    String password;
    @OneToOne
    User user;
    @OneToOne
    Employee employee;
    @ManyToOne
    Role role;
}
