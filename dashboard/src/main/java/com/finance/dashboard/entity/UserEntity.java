package com.finance.dashboard.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class UserEntity {

    private long id;
    private String username;
    private String password;
    private String role;
    private boolean active;

}
