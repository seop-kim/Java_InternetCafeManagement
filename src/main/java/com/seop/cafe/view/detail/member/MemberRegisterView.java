package com.seop.cafe.view.detail.member;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberRegisterView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        System.out.println("MemberRegisterView - render");
        System.out.println("[멤버 등록 완료]");
        System.out.println(model.get("member"));
    }
}
