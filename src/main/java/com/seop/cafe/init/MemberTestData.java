package com.seop.cafe.init;

import static com.seop.cafe.domain.Gender.*;

import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import java.util.List;

public class MemberTestData {
    private final static MemberService service = new MemberService();
    private static String[] names = {"김태섭", "성명건", "정승민", "윤현민", "김분도", "이동준", "최태영", "최고윤", "홍진혁", "박봉순"};
    private static int[] ages = {29, 28, 34, 31, 36, 40, 39, 40, 29, 45};
    private static Gender[] genders = {MALE, MALE, MALE, MALE, MALE, MALE, MALE, MALE, MALE, FEMALE};

    public static void init() {
        for (int i = 0; i < 10; i++) {
            Member member = new Member();
            member.setName(names[i]);
            member.setAge(ages[i]);
            member.setGender(genders[i]);
            service.register(member);
        }
    }
}
