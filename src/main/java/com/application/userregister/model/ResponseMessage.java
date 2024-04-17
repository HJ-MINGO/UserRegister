package com.application.userregister.model;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {

    private HttpStatus httpStatus;
    private String message;
    private Object data;

    ResponseMessage (String message){
        this(HttpStatus.OK,message,null);
    }

    public void addData(String name, Object data) {
        Map<String, Object> map;
        if (data instanceof Map ) {
            map = (Map<String, Object>) this.data;
        } else {
            map = new HashMap<String, Object>();
        }
        map.put(name,data);
        this.data = map;
    }

}
