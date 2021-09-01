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

    public int getLength() {
        return quizRepository.findAll().size();
    }

    @Transactional
    public Long save(QuizSaveRequestDto quiz) {
        return quizRepository.save(quiz.toEntity()).getId();
    }

    public QuizResponseDto findById(Long id) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 퀴즈 없음. id: " + id));

        return new QuizResponseDto(quiz);
    }

    @Transactional
    public Long updateNumber(Long id, QuizSaveRequestDto requestDto) {
        Quiz quiz = quizRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 퀴즈 없음. id: " + id));

        quiz.setAnsweredNumber(quiz.getAnsweredNumber() + 1);
        if (requestDto.getIsCorrect() == 1) {
            quiz.setSolvedNumber(quiz.getSolvedNumber() + 1);
        }

        return quizRepository.save(quiz).getId();
    }
}
