package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.domain.service.MemberService;
import com.seop.cafe.view.InputView;
import java.util.List;
import java.util.Map;

public class MemberNameSearchController implements MemberControllableMap {
    private final MemberService service = MemberService.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        System.out.print("이름을 검색해 주세요 : ");
        String name = InputView.read();
        List<Member> members = service.findName(name);
        model.put("members", members);
        return "searchNameMembers";
    }
}

