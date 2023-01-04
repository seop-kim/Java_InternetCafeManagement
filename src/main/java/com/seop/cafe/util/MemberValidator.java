package com.seop.cafe.util;

import com.seop.cafe.domain.Member;
import com.seop.cafe.repository.MemberRepository;

public class MemberValidator {
    private static final int MEMBER_NAME_MAX_LENS = 5;
    private static final int MEMBER_AGE_MIN_VALUE = 3;
    private static final int MEMBER_AGE_MAX_VALUE = 200;
    private static final String MEMBER_VALIDATE_DELETE_EXCEPTION_MSG = "존재하지 않는 회원입니다.";
    private static final MemberRepository repository = MemberRepository.getInstance();
    private Member member;

    public void registerValidate(Member member) {
        this.member = member;
        nameValidate();
        ageValidate();
        genderValidate();
    }

    private void nameValidate() {
        nameLenZero();
        nameLensValidate();
    }

    private void nameLenZero() {
        if (member.getName().length() == 0 || member.getName() == null) {
            throw new IllegalArgumentException("이름을 입력해주세요.");
        }
    }

    private void nameLensValidate() {
        if (member.getName().length() > MEMBER_NAME_MAX_LENS) {
            throw new IllegalArgumentException("이름이 너무 길어요.");
        }
    }

    private void ageValidate() {
        if (!(member.getAge() < MEMBER_AGE_MIN_VALUE || member.getAge() < MEMBER_AGE_MAX_VALUE)) {
            throw new IllegalArgumentException("가입이 불가능한 나이입니다.");
        }
    }

    private void genderValidate() {
        if (member.getGender() == null) {
            throw new IllegalArgumentException("성별을 입력해 주세요.");
        }
    }

    public void deleteValidate(Long no) {
        Member findMember = repository.findOne(no);
        if (findMember == null) {
            throw new IllegalArgumentException(MEMBER_VALIDATE_DELETE_EXCEPTION_MSG);
        }
    }
}
