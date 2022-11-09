package com.example.bussinesmanagmen.entity;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterModel {
    private String email;
    private String password;
}
