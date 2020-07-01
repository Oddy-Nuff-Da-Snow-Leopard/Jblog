package com.leverx.jblog.service.validation;

public class InputDataValidator {

    public boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
