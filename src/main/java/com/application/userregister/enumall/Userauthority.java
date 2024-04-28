package com.application.userregister.enumall;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Userauthority {
    N("NewUser","power"),
    V("VipUser","smallPower"),
    R("Admin","BigPower");
    private final String description;
    private final String right;
//    N,V,R;
}
