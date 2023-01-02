package com.seop.cafe.domain.service;

import com.seop.cafe.domain.Member;
import com.seop.cafe.repository.MemberRepository;
import com.seop.cafe.util.MemberValidator;
import java.util.List;

public class MemberService {
    MemberRepository repository = MemberRepository.getInstance();
    MemberValidator validator = new MemberValidator();
    private static final MemberService instance = new MemberService();

    public static MemberService getInstance() {
        return instance;
    }

    public Member register(Member member) {
        validator.registerValidate(member);
        return repository.save(member);
    }

    public List<Member> findAll() {
        return repository.findAll();
    }

    public List<Member> findName(String name) {
        return repository.findName(name);
    }

    public Member findNOne(Long no) {
        return repository.findOne(no);
    }

    public void delete(Long no) {
        repository.delete(no);
    }
}
