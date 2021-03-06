package com.leverx.jblog.repository;

import com.leverx.jblog.model.Comment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findAllByArticleId(Integer articleId);

    List<Comment> findAllByAuthorId(Integer authorId, Pageable page);
}
