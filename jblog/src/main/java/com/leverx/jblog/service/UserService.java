package com.leverx.jblog.service;

import com.leverx.jblog.dto.request.SignUpRequest;
import com.leverx.jblog.model.User;

import java.util.Optional;

public interface UserService {

    Integer getCurrentUserId();

    Optional<User> findByEmail(String email);

    User createUser(SignUpRequest signUpRequest);

    User save(User user);

    Optional<User> findById(Integer userId);


}
