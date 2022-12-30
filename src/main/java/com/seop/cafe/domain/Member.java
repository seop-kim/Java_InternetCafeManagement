package com.seop.cafe.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    Long no;
    String name;
    int age;
    LocalDateTime regiDate;
    LocalDateTime lastUseDate;
    Gender gender;

    public Member() {
        regiDate = LocalDateTime.now();
    }
}