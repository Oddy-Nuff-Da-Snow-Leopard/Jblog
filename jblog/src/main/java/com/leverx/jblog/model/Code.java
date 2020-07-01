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
public class Code {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private CodeType type;

    private Integer userId;

    private String hashCode;

    private Instant createdAt;
}
