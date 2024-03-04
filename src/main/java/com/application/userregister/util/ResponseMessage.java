package com.application.userregister.util;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@AllArgsConstructor
public class ResponseMessage {
    private String message;
    private HttpStatus httpStatus;
    private Object object;

}
