package com.example.demo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class AuthenticationRequest {
    private String username;
    private String password;
}
