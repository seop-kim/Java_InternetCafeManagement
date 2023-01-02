package com.seop.cafe.adapter.view.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.adapter.view.Viewable;
import java.util.Map;

public class MemberOneSearchView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        Member member = (Member) model.get("member");
        System.out.println(member);
    }
}
