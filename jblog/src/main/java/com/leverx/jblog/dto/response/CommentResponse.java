package com.leverx.jblog.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Builder
public class CommentResponse {

    private Integer id;

    private String message;

    private String authorFirstName;

    private String authorLastName;

    private Instant createdAt;
}
