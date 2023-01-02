package com.seop.cafe.adapter.view.detail.member;

import com.seop.cafe.adapter.view.Viewable;
import com.seop.cafe.domain.Member;
import java.util.List;
import java.util.Map;

public class MemberSearchView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        List<Member> members = (List<Member>) model.get("members");
        members.forEach(System.out::println);
    }
}
