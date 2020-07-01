package com.leverx.jblog.service;

import com.leverx.jblog.dto.response.CommentResponse;

import java.util.List;

public interface CommentService {

    void createComment(String comment, Integer articleId);

    List<CommentResponse> getAllArticleComments(Integer articleId);

    CommentResponse getComment(Integer commentId);

    String deleteComment(Integer commentId);

    List<CommentResponse> getFilteredComments(Integer skip, Integer limit, Integer author, String sort, String order);
}
