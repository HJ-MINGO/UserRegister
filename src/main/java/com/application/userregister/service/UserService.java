package com.application.userregister.service;

import com.application.userregister.model.RequestAll;

import java.util.Map;

public interface UserService {
    public int createUser(RequestAll.RequestNewUser newUser) throws Exception;
}
