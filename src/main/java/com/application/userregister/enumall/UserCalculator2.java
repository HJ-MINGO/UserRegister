package com.application.userregister.enumall;

public enum UserCalculator2 {
    // 이런식이면 자바7 번저에서도 자바 8버전에서와 같은 함수형 인터페이스 Functional 을 사용가능
    CALL_A {
        long calculate(long value) {
            return value;
        }
    },
    CALL_B {
        long calculate(long value) {
            return value/2;
        }
    };
    abstract long calculate(long value); // 상수별 메서드 구현하도록 인터페이스 선언
}
