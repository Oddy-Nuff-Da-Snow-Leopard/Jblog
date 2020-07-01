package com.leverx.jblog.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Builder
public class ArticleResponse {

    private Integer id;

    private String title;

    private String text;

    private String authorFirstName;

    private String authorLastName;

    private Instant createdAt;

    private Instant updatedAt;

    private List<String> tags;
}
