package com.application.userregister.service.impl;

import com.application.userregister.entity.User;
import com.application.userregister.entity.Userauthority;
import com.application.userregister.model.RequestAll;
import com.application.userregister.repository.UserRepository;
import com.application.userregister.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // DB를 추상화한 개념
    private final EntityManager entityManager;

    @Override
    @Transactional
    public int createUser(RequestAll.RequestNewUser newUser) throws Exception {

        EntityTransaction transaction = this.entityManager.getTransaction();

        User user = User.builder()
                .userId(newUser.getUserId())
                .userPass(newUser.getUserPass())
                .userName(newUser.getUserName())
                .userPhone(newUser.getUserPhone())
                .userGender("남")
                .userEmail(newUser.getUserEmail())
                .userAddress(newUser.getUserAddress())
                .userAuthority(Userauthority.N)
                .userAuthorityName("신입회원")
                .userBirth(newUser.getUserBirth())
                .build();
//        Collections.singletonList("sad");
        this.userRepository.save(user); //영속화 =>
        return 0;
    }
}
