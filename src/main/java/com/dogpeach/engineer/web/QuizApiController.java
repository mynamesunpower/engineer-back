package com.dogpeach.engineer.web;

import com.dogpeach.engineer.service.QuizService;
import com.dogpeach.engineer.web.dto.request.QuizUpdateRequestDto;
import com.dogpeach.engineer.web.dto.response.QuizResponseDto;
import com.dogpeach.engineer.web.dto.request.QuizSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class QuizApiController {

    private final QuizService quizService;

    @GetMapping("/api/v1/quiz/length")
    public int getLength() { return quizService.getLength(); }

    @GetMapping("/api/v1/quiz/{id}")
    public QuizResponseDto getQuiz(@PathVariable Long id) {
        return quizService.findById(id);
    }

    @PostMapping("/api/v1/quiz")
    public Long insertQuiz(@RequestBody QuizSaveRequestDto requestDto) {
      return quizService.save(requestDto);
    }

    @PatchMapping("/api/v1/quiz/solved/{id}")
    public Long updateNumber(@PathVariable Long id, @RequestBody QuizUpdateRequestDto requestDto) {
        return quizService.updateNumber(id, requestDto);
    }
}
