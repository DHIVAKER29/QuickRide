package com.scaler.quickride.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@MappedSuperclass
public class User extends BaseModel{
    private String name;
    private String email;
    private String password;
    private String gender;
    private UserType userType;
}
