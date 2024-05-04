package com.application.userregister.enumall;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;

@AllArgsConstructor
public enum UserCalculator {
    // 각 코드별로 계산식을 다르게 할수있다.
    CALL_A(value -> value),
    CALL_B(value -> value/2);
    // 자바8부터는 매개변수로 함수를 던질수 있어서 enum도 가능
    private Function<Long,Long> calculator;
    public long getCalculator(long value){
        return calculator.apply(value);
    }
    // entity클래스경우에는 어노테이션으로 @Enumerated를 사용하면된다.
}
