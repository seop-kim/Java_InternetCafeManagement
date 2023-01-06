package com.seop.cafe.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    @Override
    public String toString() {
        return "고유번호 : " + no +
                "\t이름 : " + name +
                "\t나이 : " + age +
                "\t가입일 : " + regiDate.format(DateTimeFormatter.ISO_DATE) +
                "\t최종로그인 : " + lastUseDate +
                "\t성별 : " + Gender.getGender(gender);
    }
}