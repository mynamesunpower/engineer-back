package com.dogpeach.engineer.domain.quiz;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1, nullable = false)
    private String quizType;

    @Column(length = 30, nullable = false)
    private String category1;

    @Column(length = 30)
    private String category2;

    @Column(nullable = false)
    private String quiz;

    @Column(length = 500, nullable = false)
    private String answer;

    @Column(length = 1, nullable = false)
    private String previousYn;

    @Column(length = 4)
    private String previousYear;

    @Column(length = 1)
    private String previousNumber;

    @Column
    private Long solvedNumber;

    @Column
    private Long answeredNumber;

    @Column
    private String description;

}
