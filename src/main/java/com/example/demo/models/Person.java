package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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
    @NotEmpty(message = "name should not be empty")
    @Size(min = 2, max = 20, message = "name should be between 2 and 20 characters")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "year_of_birth")
    @Min(value = 0, message = "year should be greater than 0")
    int year;

    @Column(name = "email")
    @Email
    @NotEmpty(message = "email should not be empty")
    String email;

    @Column(name = "salt")
    String salt;

    @Column(name = "role")
    @NotEmpty(message = "role should not be empty")
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

