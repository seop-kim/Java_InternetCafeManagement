package com.seop.cafe.service;

import com.seop.cafe.domain.Member;
import com.seop.cafe.repository.MemberRepository;
import com.seop.cafe.util.MemberValidator;

public class MemberService {
    MemberRepository repository = MemberRepository.getInstance();
    MemberValidator validator = new MemberValidator();

    public Member register(Member member) {
        validator.registerValidate(member);
        return repository.save(member);
    }
}
