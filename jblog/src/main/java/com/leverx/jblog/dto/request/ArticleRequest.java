package com.leverx.jblog.dto.request;

import com.leverx.jblog.model.ArticleStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ArticleRequest {

    private String title;

    private String text;

    private ArticleStatus articleStatus;

    private List<String> tagList;
}
