package com.seop.cafe.view.member.update;

import com.seop.cafe.domain.Member;
import com.seop.cafe.view.Viewable;
import java.util.Map;

public class MemberUpdateCompView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        Member member = (Member) model.get("updateMember");
        System.out.println(member);
    }
}
