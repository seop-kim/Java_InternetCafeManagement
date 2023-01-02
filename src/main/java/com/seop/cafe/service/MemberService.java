package com.seop.cafe.service;

import com.seop.cafe.domain.Member;
import com.seop.cafe.repository.MemberRepository;
import com.seop.cafe.util.MemberValidator;
import java.util.List;
import java.util.stream.Stream;
import javax.xml.stream.StreamFilter;

public class MemberService {
    private final MemberRepository repository = MemberRepository.getInstance();
    private final MemberValidator validator = new MemberValidator();

    private static final String MEMBER_VALIDATE_DELETE_EXCEPTION_MSG = "존재하지 않는 회원입니다.";

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
        deleteValidate(no);
        repository.delete(no);
    }


    private void deleteValidate(Long no) {
        Member findMember = repository.findOne(no);
        if (findMember == null) {
            throw new IllegalArgumentException(MEMBER_VALIDATE_DELETE_EXCEPTION_MSG);
        }
    }
}
