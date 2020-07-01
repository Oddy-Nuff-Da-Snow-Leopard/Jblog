package com.leverx.jblog.repository;

import com.leverx.jblog.model.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CodeRepository extends JpaRepository<Code, Integer> {

    Optional<Code> findByHashCode(String hashCode);
}
