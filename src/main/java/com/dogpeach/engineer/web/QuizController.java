package com.dogpeach.engineer.web;

import com.dogpeach.engineer.domain.quiz.Quiz;
import com.dogpeach.engineer.domain.quiz.QuizRepository;
import com.dogpeach.engineer.service.QuizService;
import com.dogpeach.engineer.web.dto.QuizSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class QuizController {

    private final QuizService quizService;

    @PostMapping("/insert")
    public Long insertQuiz(@RequestBody QuizSaveRequestDto requestDto) {
      return quizService.save(requestDto);
    }

}
