package com.simple.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserJoinRequest {

    // 회원가입시 RequestBody로 데이터를 받아올때 사용
    private String userName;
    private String password;
}
