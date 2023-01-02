package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.domain.service.MemberService;
import com.seop.cafe.view.InputView;
import java.util.Map;

public class MemberRegisterController implements MemberControllableMap {
    private final MemberService service = MemberService.getInstance();
    private static final String PATH = "regi";
    private static final String MEMBER_REQUEST_REGI_USER_NAME = "이름을 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_AGE = "나이를 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_GENDER = "성별을 입력해 주세요 (1 : 남자, 2 : 여자) : ";
    private static final String GENDER_MALE = "1";
    private static final String GENDER_FEMALE = "2";


    @Override
    public String process(Map<String, Object> model) {
        Member member = createMember();
        Member regiMember = service.register(member);
        model.put("member", regiMember);
        return PATH;
    }

    private Member createMember() {
        Member member = new Member();
        System.out.print(MEMBER_REQUEST_REGI_USER_NAME);
        member.setName(InputView.read());
        System.out.print(MEMBER_REQUEST_REGI_USER_AGE);
        member.setAge(Integer.parseInt(InputView.read()));
        System.out.print(MEMBER_REQUEST_REGI_USER_GENDER);
        Gender gender = selectGender(InputView.read());
        member.setGender(gender);
        return member;
    }

    private Gender selectGender(String read) {
        Gender gender = null;
        if (read.equals(GENDER_MALE)) {
            gender = Gender.MALE;
        }

        if (read.equals(GENDER_FEMALE)) {
            gender = Gender.FEMALE;
        }
        return gender;
    }
}
