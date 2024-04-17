package com.application.userregister.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Userauthority {
    N("신입회원"),
    V("VIP회원"),
    R("관리자");
    private final String description;
}
