package com.application.userregister.enumall;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserErrorCode {
    USER_ERROR_CODE1("회원가입 망"),
    USER_ERROR_CODE2("핵망"),

    //기타등등 정말 알숭벗는 그런에러들이 발생했을때 어쩔수없이 써야되는 예외  internal server error
    INTERNAL_SERVER_ERROR("서버오류 발생"),
    INVALID_REQUEST("잘못된요청입니다");
    private final String message;
}
