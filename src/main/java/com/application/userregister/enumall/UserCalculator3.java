package com.application.userregister.enumall;

import com.mysql.cj.xdevapi.Collection;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
public enum UserCalculator3 {
    CASH("현금",Arrays.asList("ACCOUNT_TRANSFER","REMITTANCE","ON_SITE_PAYMENT","TOSS")),
    CARD("카드",Arrays.asList("PAYCO","CARD","KAKAO_PAY")),
    ETC("기타",Arrays.asList("POINT,COUPON")),
    EMPTY("없음",Collections.EMPTY_LIST);

    private String title;
    private List<String> payList;

    public static UserCalculator3 findByPayCode(String code) {
        return Arrays.stream(UserCalculator3.values())
                .filter(payGroup -> payGroup.hasPayCode(code))
                .findAny().orElse(EMPTY);
    }
    public boolean hasPayCode(String code) {
        return payList.stream().anyMatch(pay -> pay.equals(code));
    }

}
