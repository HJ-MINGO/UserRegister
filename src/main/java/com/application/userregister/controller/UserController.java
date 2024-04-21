package com.application.userregister.controller;

import com.application.userregister.model.RequestAll;
import com.application.userregister.model.ResponseMessage;
import com.application.userregister.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/insertUser.on")
    public ResponseEntity<ResponseMessage> insertNewUser(@Valid @RequestBody RequestAll.RequestNewUser newUser) throws Exception {

        ResponseMessage msg = new ResponseMessage("등록완료됐습니다.");

        int result = this.userService.createUser(newUser);
        msg.addData("result",result);
        return new ResponseEntity<ResponseMessage>(msg, HttpStatus.OK);
    }
}
