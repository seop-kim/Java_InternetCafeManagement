package com.seop.cafe.init;

import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;

public class MemberTestData {
    private final static MemberService service = new MemberService();

    public static void init() {
        for (int i = 0; i < 10; i++) {
            Member member = new Member();
            member.setName("mem" + i);
            member.setAge(10 + i);
            member.setGender(Gender.MALE);
            service.register(member);
        }
    }
}
