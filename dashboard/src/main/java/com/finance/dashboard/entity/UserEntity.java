package com.finance.dashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue
    private long id;

    private String username;
    private String password;
    private String role; // ADMIN, ANALYST, VIEWER
    private boolean active;

}
