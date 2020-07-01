package com.leverx.jblog.service;

import com.leverx.jblog.model.Code;
import com.leverx.jblog.model.CodeType;

import java.util.Optional;

public interface CodeService {

    Code createCode(CodeType type, Integer userId);

    Code save(Code code);

    Optional<Code> findByHashCode(String hashCode);

    void delete(Code code);
}
