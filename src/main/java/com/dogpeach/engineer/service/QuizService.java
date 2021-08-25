package com.dogpeach.engineer.service;

import com.dogpeach.engineer.domain.quiz.Quiz;
import com.dogpeach.engineer.domain.quiz.QuizRepository;
import com.dogpeach.engineer.web.dto.response.QuizResponseDto;
import com.dogpeach.engineer.web.dto.request.QuizSaveRequestDto;
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

    public QuizResponseDto findById(Long id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 퀴즈 없음. id: " + id));

        return new QuizResponseDto(quiz);
    }
}
