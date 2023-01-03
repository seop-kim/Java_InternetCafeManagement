package com.seop.cafe.controller.member;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import com.seop.cafe.view.common.InputView;
import java.util.List;
import java.util.Map;

public class MemberNameSearchFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String PATH = "memberSearchNameMembers";
    private static final String MEMBER_REQUEST_SEARCH_USER_NAME = "이름을 검색해 주세요 : ";

    @Override
    public String process(Map<String, Object> model) {
        System.out.print(MEMBER_REQUEST_SEARCH_USER_NAME);
        String name = InputView.read();
        List<Member> members = service.findName(name);
        model.put("members", members);
        return PATH;
    }
}

