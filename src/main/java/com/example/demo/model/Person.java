package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "year_of_birth")
    int year;

    @Column(name = "email")
    String email;

    @Column(name = "salt")
    String salt;

    @Column(name = "role")
    String role;

    public Person(String username, String password, int year, String email, String salt, String role) {
        this.username = username;
        this.password = password;
        this.year = year;
        this.email = email;
        this.salt = salt;
        this.role = role;
    }

}

