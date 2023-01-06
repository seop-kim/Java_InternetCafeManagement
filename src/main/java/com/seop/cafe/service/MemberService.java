package com.seop.cafe.service;

import com.seop.cafe.domain.Member;
import com.seop.cafe.repository.MemberRepository;
import com.seop.cafe.util.MemberValidator;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberService {
    private final MemberRepository repository = MemberRepository.getInstance();
    private final MemberValidator validator = new MemberValidator();

    public Member register(Member member) {
        validator.registerValidate(member);
        return repository.save(member);
    }

    public List<Member> findAll() {
        return repository.findAll();
    }

    public List<Member> findName(String name) {
        validator.searchValidate(name);
        return repository.findName(name);
    }

    public Member findNOne(Long no) {
        return repository.findOne(no);
    }

    public void delete(Long no) {
        validator.deleteValidate(no);
        repository.delete(no);
    }
}
