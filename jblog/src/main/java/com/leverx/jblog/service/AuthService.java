package com.leverx.jblog.service;

import com.leverx.jblog.dto.request.ResetPasswordRequest;
import com.leverx.jblog.dto.request.SignInRequest;
import com.leverx.jblog.dto.request.SignUpRequest;
import com.leverx.jblog.dto.response.SignInResponse;

public interface AuthService {

    String signUp(SignUpRequest registerRequest);

    String confirmRegistration(String hashCode);

    String signIn(SignInRequest signInRequest);

    String sendResetCodeToEmail(String email);

    String resetPassword(ResetPasswordRequest resetPasswordRequest);

    String checkResetCodeRelevance(String hashCode);
}
