package com.simple.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserLoginRequest {

    // 로그인시 RequestBody로 데이터를 받아올때 사용
    private String userName;
    private String password;
}
