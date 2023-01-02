package com.seop.cafe.view.detail.member;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberDeleteView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        System.out.println("MemberDeleteView - render");
        System.out.println("회원 정보가 삭제 되었습니다.");
    }
}
