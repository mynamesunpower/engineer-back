package com.dogpeach.engineer.web.dto.response;

import com.dogpeach.engineer.domain.quiz.Quiz;
import lombok.Getter;

@Getter
public class QuizResponseDto {

    private Long id;
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

    public QuizResponseDto(Quiz entity) {
        this.id = entity.getId();
        this.quizType = entity.getQuiz();
        this.category1 = entity.getCategory1();
        this.category2 = entity.getCategory2();
        this.quiz = entity.getQuiz();
        this.answer = entity.getAnswer();
        this.previousYn = entity.getPreviousYn();
        this.previousYear = entity.getPreviousYear();
        this.previousNumber = entity.getPreviousNumber();
        this.solvedNumber = entity.getSolvedNumber();
        this.answeredNumber = entity.getAnsweredNumber();
        this.description = entity.getDescription();
    }
}
