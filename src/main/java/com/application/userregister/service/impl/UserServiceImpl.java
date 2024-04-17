package com.application.userregister.service.impl;

import com.application.userregister.entity.User;
import com.application.userregister.entity.Userauthority;
import com.application.userregister.repository.UserRepository;
import com.application.userregister.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public int createUser() throws Exception {
        User user = User.builder()
                .userId("sjc737")
                .userPass("asdasd")
                .userName("")
                .userPhone("")
                .userGender("")
                .userEmail("")
                .userAddress("asd")
                .userauthority(Userauthority.N)
                .userAuthorityName("")
                .userBirth("")
                .build();
        Collections.singletonList("sad");
        userRepository.save(user);
        return 0;
    }
}
