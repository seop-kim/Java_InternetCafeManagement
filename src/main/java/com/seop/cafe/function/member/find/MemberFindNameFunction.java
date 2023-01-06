package com.seop.cafe.function.member.find;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import java.util.List;
import java.util.Map;

public class MemberFindNameFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String VIEW_PATH = "MEMBER_SEARCH_NAME_VIEW";


    @Override
    public String process(Map<String, Object> model) {
        String name = (String) model.get("findName");
        List<Member> members = service.findName(name);
        model.put("members", members);
        return VIEW_PATH;
    }
}

