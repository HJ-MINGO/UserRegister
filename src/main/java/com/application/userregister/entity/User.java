package com.application.userregister.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* 회원 ID */
    private String userId;
    /* 회원 비밀번호 */
    private String userPass;
    /* 회원 이름*/
    private String userName;
    /* 회원 전화번호*/
    private String userPhone;
    /* 회원 성별 */
    private String userGender;
    /* 회원 이메일 */
    private String userEmail;
    /* 회원 주소 */
    private String userAddress;
    /* 회원 등급명 */
    private String userAuthorityName;
    /* 회원 생년월일 */
    private String userBirth;
    /* 회원등급 */
    @Enumerated(EnumType.STRING)
    private Userauthority userauthority;
    /* @CreatedDate => 처음 최초 생성시간 입력 */
    @CreatedDate
    private LocalDateTime frstInpYmd;
    /* @LastModifiedDate => 최종 수정시간 입력 */
    @LastModifiedDate
    private LocalDateTime lstInpYmd;
}
