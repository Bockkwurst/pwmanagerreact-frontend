package com.example.pwmanager.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}