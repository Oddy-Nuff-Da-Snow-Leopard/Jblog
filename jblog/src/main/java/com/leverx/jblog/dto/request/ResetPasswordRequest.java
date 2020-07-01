package com.leverx.jblog.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetPasswordRequest {

    private String hashCode;

    private String newPassword;

    private String newConfirmedPassword;
}
