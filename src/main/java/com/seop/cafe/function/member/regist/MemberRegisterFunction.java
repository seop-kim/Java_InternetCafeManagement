package com.seop.cafe.function.member.regist;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import com.seop.cafe.view.common.InputView;
import java.util.Map;

public class MemberRegisterFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String PATH = "MEMBER_REGI_COMP";

    @Override
    public String process(Map<String, Object> model) {
        Member member = getMember(model);
        Member regiMember = service.register(member);
        model.put("member", regiMember);
        return PATH;
    }

    private Member getMember(Map<String, Object> model) {
        Member member = new Member();

        String name = (String) model.get("NAME");
        member.setName(name);

        String age = (String) model.get("AGE");
        member.setAge(Integer.parseInt(age));

        String readGender = (String) model.get("GENDER");
        Gender gender = Gender.getGender(readGender);
        member.setGender(gender);

        return member;
    }
}
