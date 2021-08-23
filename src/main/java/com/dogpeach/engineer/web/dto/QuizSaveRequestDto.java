package com.dogpeach.engineer.web.dto;

import com.dogpeach.engineer.domain.quiz.Quiz;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class QuizSaveRequestDto {

    private String quizType;
    private String category1;
    private String category2;
    private String quiz;
    private String answer;
    private String previousYn;
    private String previousYear;
    private String previousNumber;
    private Long solvedNumber;
    private Long answeredNumber;
    private String description;

    @Builder
    public QuizSaveRequestDto(String quizType, String category1, String category2, String quiz, String answer, String previousYn, String previousYear, String previousNumber, Long solvedNumber, Long answeredNumber, String description) {
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

    public Quiz toEntity() {
        return Quiz.builder()
                .quizType(quizType)
                .category1(category1)
                .category2(category2)
                .quiz(quiz)
                .answer(answer)
                .previousYn(previousYn)
                .previousYear(previousYear)
                .previousNumber(previousNumber)
                .solvedNumber(solvedNumber)
                .answeredNumber(answeredNumber)
                .description(description)
                .build();
    }
}