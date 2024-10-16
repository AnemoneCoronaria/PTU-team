package com.PTUproject.login.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private String id;
    private String password;
    private String email;
    private String error;   //error 메세지를 위한 것
}
