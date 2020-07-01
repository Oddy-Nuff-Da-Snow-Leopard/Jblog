package com.leverx.jblog.repository;

import com.leverx.jblog.model.Article;
import com.leverx.jblog.model.ArticleStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    List<Article> findAllByStatus(ArticleStatus status);

    List<Article> findAllByAuthorId(Integer authorId);

    List<Article> findAllByTitleAndAuthorId(String title, Integer authorId, Pageable page);
}
