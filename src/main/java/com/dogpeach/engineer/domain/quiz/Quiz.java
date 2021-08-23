package com.dogpeach.engineer.domain.quiz;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "quiz")
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

    @Builder
    public Quiz(String quizType, String category1, String category2, String quiz, String answer, String previousYn, String previousYear, String previousNumber, Long solvedNumber, Long answeredNumber, String description) {
        this.quizType = quizType;
        this.category1 = category1;
        this.category2 = category2;
        this.quiz = quiz;
        this.answer = answer;
        this.previousYn = previousYn;
        this.previousYear = previousYear;
        this.previousNumber = previousNumber;
        this.solvedNumber = solvedNumber;
        this.answeredNumber = answeredNumber;
        this.description = description;
    }
}
