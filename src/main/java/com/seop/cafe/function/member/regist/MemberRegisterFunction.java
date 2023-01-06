package com.seop.cafe.function.member.regist;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import com.seop.cafe.view.common.InputView;
import java.util.Map;

public class MemberRegisterFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String PATH = "memberRegi";
    private static final String MEMBER_REQUEST_REGI_USER_NAME = "이름을 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_AGE = "나이를 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_GENDER = "성별을 입력해 주세요 (1 : 남자, 2 : 여자) : ";

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
        return Gender.getGender(read);
    }
}
