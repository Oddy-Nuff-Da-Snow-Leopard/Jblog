package com.leverx.jblog.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SignInResponse {

    private String email;

    private String authenticationToken;
}
