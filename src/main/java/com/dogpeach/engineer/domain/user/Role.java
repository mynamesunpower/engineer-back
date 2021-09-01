package com.dogpeach.engineer.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    COMMON_USER("ROLE_COMMON_USER", "일반 회원"),
    MEMBERSHIP_USER("ROLE_MEMBERSHIP_USER", "멤버십 회원"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
