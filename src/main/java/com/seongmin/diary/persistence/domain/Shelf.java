package com.seongmin.diary.persistence.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "shelf")
@Getter
@NoArgsConstructor
public class Shelf {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tag_year", length = 9999, nullable = false)
    private int tagYear;
    @Column(name = "created_dt", nullable = false)
    private LocalDateTime createDt;
    @Column(name = "modified_dt", nullable = false)

    private LocalDateTime modifiedDt;
}
