package com.application.userregister.model;

import com.application.userregister.domain.ToDoEntity;

/**
 *  packet의 역할을 할 모델
 *
 *
 * */
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean complpleted;
    private String url;

    public TodoResponse(ToDoEntity ent){
        this.id = ent.getId();
        this.title = ent.getTitle();
        this.order = ent.getOrder();
        this.complpleted = ent.getCompleted();
        this.url = "baseUrl";
    }
}
