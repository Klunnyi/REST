package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @Column(name = "username")
    String username;

    @Column(name = "passord")
    String password;

    @Column(name = "year_of_birth")
    int year;

    @Column(name = "email")
    String email;

    @Column(name = "salt")
    String salt;

    @Column(name = "role")
    String role;

}

