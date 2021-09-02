package com.dogpeach.engineer.web.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class QuizUpdateRequestDto {
    private int isCorrect;
}
