package com.application.userregister.model;

import com.application.userregister.entity.Userauthority;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;


public class RequestAll {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class RequestNewUser{
        /* 회원 ID */
        @NotNull
        private String userId;
        @NotNull
        /* 회원 비밀번호 */
        private String userPass;
        @NotNull
        /* 회원 이름*/
        private String userName;
        /* 회원 전화번호*/
        private String userPhone;
        /* 회원 이메일 */
        private String userEmail;
        /* 회원 주소 */
        private String userAddress;
        @NotNull
        @Min(6)
        @Max(6)
        /* 회원 생년월일 */
        private String userBirth;
        /* 회원등급 */
        @Enumerated(EnumType.STRING)
        private Userauthority userAuthority;
    }
}
