package com.application.userregister.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {

    private String message;
    private HttpStatus httpStatus;
    private Object object;

}
