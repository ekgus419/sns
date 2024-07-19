package com.simple.sns.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 공통된 Response 를 내려주기 위해 사용하는 클래스
@Getter
@AllArgsConstructor
public class Response<T> {

    private String resultCode;
    private T result;

    public static Response<Void> error(String errorCode) {
        return new Response<>(errorCode, null);
    }

    public static <T> Response<T> success(T result) {
        return new Response<>("SUCCESS", result);
    }
}
