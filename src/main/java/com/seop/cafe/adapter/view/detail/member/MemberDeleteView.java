package com.seop.cafe.adapter.view.detail.member;

import com.seop.cafe.adapter.view.Viewable;
import java.util.Map;

public class MemberDeleteView implements Viewable {
    private static final String MEMBER_DELETE_USER_MSG = "회원 정보가 삭제 되었습니다.";

    @Override
    public void render(Map<String, Object> model) {
        System.out.println(MEMBER_DELETE_USER_MSG);
    }
}
