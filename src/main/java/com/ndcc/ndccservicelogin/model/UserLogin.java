package com.ndcc.ndccservicelogin.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

public class UserLogin {

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private String userId;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private String password;

    @Getter(AccessLevel.PUBLIC)
    @Setter (AccessLevel.PUBLIC)
    private String email;

}
