package com.leverx.jblog.service;

import com.leverx.jblog.dto.response.ArticleResponse;
import com.leverx.jblog.model.TagArticle;

import java.util.List;
import java.util.Map;

public interface TagService {

    List<String> getAllArticleTags(Integer articleId);

    void addTagsToArticle(Integer articleId, List<String> tagNameList);

    void deleteAllArticleTags(Integer articleId);;

    List<TagArticle> getAllTagArticle(List<String> tagNameList);

    Map<String, Long> tagCloud();
}
