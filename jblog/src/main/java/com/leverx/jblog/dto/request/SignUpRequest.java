package com.leverx.jblog.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String confirmedPassword;
}
