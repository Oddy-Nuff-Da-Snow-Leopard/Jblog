package com.leverx.jblog.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String text;

    private ArticleStatus status;

    private Integer authorId;

    private Instant createdAt;

    private Instant updatedAt;
}
