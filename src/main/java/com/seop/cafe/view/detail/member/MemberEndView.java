package com.seop.cafe.view.detail.member;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberEndView implements Viewable {
    private static final String MEMBER_FUNCTION_END_MSG = "이전 단계로 이동합니다.";

    @Override
    public void render(Map<String, Object> model) {
        System.out.println(MEMBER_FUNCTION_END_MSG);
    }
}
