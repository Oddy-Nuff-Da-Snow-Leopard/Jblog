package com.leverx.jblog.repository;

import com.leverx.jblog.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {

    Optional<Tag> findById(Integer id);

    Optional<Tag> findByName(String name);
}
