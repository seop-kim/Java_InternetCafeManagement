package com.seop.cafe.view.detail.member;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberEndView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        System.out.println("MemberEndView - render");
        System.out.println("이전 단계로 이동합니다.");
    }
}
