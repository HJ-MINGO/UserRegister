package com.application.userregister.exception;

import com.application.userregister.enumall.UserErrorCode;
import lombok.Getter;

@Getter
public class UserException extends RuntimeException{
    private UserErrorCode userErrorCode;
    private String message;
}
