package com.seop.cafe.view.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.view.Viewable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MemberNameSearchView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        List<Member> members = (List<Member>) model.get("members");
        members.forEach(System.out::println);
    }
}
