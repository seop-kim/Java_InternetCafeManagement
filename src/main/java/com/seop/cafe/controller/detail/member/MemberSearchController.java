package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.domain.service.MemberService;
import java.util.List;
import java.util.Map;

public class MemberSearchController implements MemberControllableMap {
    private final MemberService service = MemberService.getInstance();
    private static final String PATH = "searchMembers";

    @Override
    public String process(Map<String, Object> model) {
        List<Member> members = service.findAll();
        model.put("members", members);
        return PATH;
    }
}
