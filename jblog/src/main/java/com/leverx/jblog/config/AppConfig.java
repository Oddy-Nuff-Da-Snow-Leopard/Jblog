package com.leverx.jblog.config;

import com.leverx.jblog.service.validation.InputDataValidator;
import com.leverx.jblog.service.validation.UserDataValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InputDataValidator inputDataValidator() {
        return new InputDataValidator();
    }

    @Bean
    public UserDataValidator userDataValidator() {
        return new UserDataValidator();
    }
}
