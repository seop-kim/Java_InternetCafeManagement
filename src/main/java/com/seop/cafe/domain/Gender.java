package com.seop.cafe.domain;

public enum Gender {
    MALE("1", "남"),
    FEMALE("2", "여");

    private final String no;
    private final String gender;


    Gender(String no, String gender) {
        this.no = no;
        this.gender = gender;
    }

    public static String getGender(Gender gender) {
        return gender.gender;
    }

    public static Gender getGender(String no) {
        for (Gender findGender : Gender.values()) {
            if (findGender.no.equals(no)) {
                return findGender;
            }
        }
        throw new IllegalArgumentException("찾는 성별이 없습니다.");
    }
}
