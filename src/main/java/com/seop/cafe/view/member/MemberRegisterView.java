package com.seop.cafe.view.member;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberRegisterView implements Viewable {
    private static final String MEMBER_REGISTER_USER_MSG = "[멤버 등록 완료]";
    @Override
    public void render(Map<String, Object> model) {
        System.out.println(MEMBER_REGISTER_USER_MSG);
        System.out.println(model.get("member"));
    }
}
