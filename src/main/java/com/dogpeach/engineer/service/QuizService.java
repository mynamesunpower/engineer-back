package com.dogpeach.engineer.service;

import com.dogpeach.engineer.domain.quiz.QuizRepository;
import com.dogpeach.engineer.web.dto.QuizSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Transactional
    public Long save(QuizSaveRequestDto quiz) {
        return quizRepository.save(quiz.toEntity()).getId();
    }
}
