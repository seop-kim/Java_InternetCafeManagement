package com.seop.cafe.controller.member;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import java.util.List;
import java.util.Map;

public class MemberSearchFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String PATH = "memberSearchMembers";

    @Override
    public String process(Map<String, Object> model) {
        List<Member> members = service.findAll();
        model.put("members", members);
        return PATH;
    }
}
