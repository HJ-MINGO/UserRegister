package com.application.userregister.controller;

import com.application.userregister.enumall.UserCalculator;
import com.application.userregister.enumall.Userauthority;

public class maintest {

    public static void main(String[] args) {
        Userauthority u = Userauthority.N;
        System.out.println(u.getDescription());
        System.out.println(u.getRight());
        UserCalculator c = UserCalculator.CALL_A;
        System.out.println(c.getCalculator(1000L));
    }
}
