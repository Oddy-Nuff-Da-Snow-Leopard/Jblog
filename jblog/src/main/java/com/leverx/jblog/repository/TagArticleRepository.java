package com.leverx.jblog.repository;

import com.leverx.jblog.model.TagArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TagArticleRepository extends JpaRepository<TagArticle, Integer> {

    List<TagArticle> findAllByArticleId(Integer articleId);

    void deleteByArticleId(Integer articleId);

    List<TagArticle> findAllByTagId(Integer id);
}
