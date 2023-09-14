package com.ruisu.hamptoneapigateway.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 40)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "firstname", nullable = false)
    private  String firstname;

    @Column(name = "lastname", nullable = false)
    private  String lastname;

    @Column(name= "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

}
