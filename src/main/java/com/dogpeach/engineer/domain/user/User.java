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

    @Builder
    public User(String nickname, String email, Role role) {
        this.nickname = nickname;
        this.email = email;
        this.role = role;
    }

    public User update(String nickname) {
        this.nickname = nickname;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

}
