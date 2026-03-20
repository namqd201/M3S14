package com.tmdt.m3s14.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String accessToken;
    private String type = "Bearer";
    private String username;

    public LoginResponse(String accessToken, String username) {
        this.accessToken = accessToken;
        this.username = username;
    }
}
