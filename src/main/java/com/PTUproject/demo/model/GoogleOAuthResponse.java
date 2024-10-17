package com.PTUproject.demo.model;

import lombok.Data;

@Data
public class GoogleOAuthResponse {
    private String accessToken;
    private String expiresIn;
    private String refreshToken;
    private String scope;
    private String tokenType;
    private String idToken;
}

//이게 응답을 받을 모델
