package com.application.userregister.controller;

import com.application.userregister.model.TodoResponse;
import com.application.userregister.service.TodoService;
import com.application.userregister.util.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class CommonMainController {

    private final TodoService todoService;

    @PostMapping("/findById")
    public ResponseEntity<TodoResponse> loginController() {
        ResponseMessage msg = new ResponseMessage();
        Long id = 123L;
        return new ResponseEntity<>(this.todoService.searchById(id),HttpStatus.OK);
    }
}
