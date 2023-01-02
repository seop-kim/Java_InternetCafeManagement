package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Gender;
import com.seop.cafe.domain.Member;
import com.seop.cafe.domain.service.MemberService;
import com.seop.cafe.view.InputView;
import java.util.Map;

public class MemberRegisterController implements MemberControllableMap {
    private final MemberService service = MemberService.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        Member member = createMember();
        Member regiMember = service.register(member);
        model.put("member", regiMember);
        return "regi";
    }

    private Member createMember() {
        Member member = new Member();
        System.out.print("이름을 입력해 주세요 : ");
        member.setName(InputView.read());
        System.out.print("나이를 입력해 주세요 : ");
        member.setAge(Integer.parseInt(InputView.read()));
        System.out.print("성별을 입력해 주세요 (1 : 남자, 2 : 여자) : ");
        Gender gender = selectGender(InputView.read());
        member.setGender(gender);
        return member;
    }

    private Gender selectGender(String read) {
        Gender gender = null;
        if (read.equals("1")) {
            gender = Gender.MALE;
        }

        if (read.equals("2")) {
            gender = Gender.FEMALE;
        }
        return gender;
    }
}
