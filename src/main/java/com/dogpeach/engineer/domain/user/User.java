package com.dogpeach.engineer.domain.user;

import com.dogpeach.engineer.domain.quiz.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column
    private Integer answered;

    @Column
    private Integer solved;

    @Column
    private Integer failed;

    @Column
    private String solvedQuizNo;

    @Column
    private String wrongQuizNo;

    @Builder
    public User(String nickname, String email, Role role, Integer answered, Integer solved, Integer failed, String solvedQuizNo, String wrongQuizNo) {
        this.nickname = nickname;
        this.email = email;
        this.role = role;
        this.answered = answered;
        this.solved = solved;
        this.failed = failed;
        this.solvedQuizNo = solvedQuizNo;
        this.wrongQuizNo = wrongQuizNo;
    }

    public User update(String nickname) {
        this.nickname = nickname;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

}
