package com.seop.cafe.repository;

import com.seop.cafe.domain.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static final Map<Long, Member> members = new HashMap<>();
    private static Long no = 0L;

    private static final MemberRepository instance = new MemberRepository();

    private MemberRepository() {
    }

    public static MemberRepository getInstance() {
        return instance;
    }

    public Member save(Member member) {
        member.setNo(++no);
        members.put(member.getNo(), member);
        return member;
    }

    public List<Member> findAll() {
        return new ArrayList<>(members.values());
    }

    public Member findOne(Long no) {
        return members.get(no);
    }

    public List<Member> findName(String name) {
        List<Member> findMembers = new ArrayList<>();
        for (Member member : members.values()) {
            if (member.getName().equals(name)) {
                findMembers.add(member);
            }
        }
        return findMembers;
    }

    public Member delete(Long no) {
        return members.remove(no);
    }

    public int size() {
        return members.size();
    }

    public void clear() {
        no = 0L;
        members.clear();
    }
}