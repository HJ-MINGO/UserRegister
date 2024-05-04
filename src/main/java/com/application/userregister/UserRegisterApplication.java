package com.application.userregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 *  @EnableJpaAuditing 기능으로
 *  Entity에 @CreatedDate ,@LastModifiedDate 어노테이션을 쓸수 있다.
 * */
@EnableJpaAuditing
@SpringBootApplication
public class UserRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRegisterApplication.class, args);
    }

}
