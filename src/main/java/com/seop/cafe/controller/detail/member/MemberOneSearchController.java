package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.domain.service.MemberService;
import com.seop.cafe.view.InputView;
import java.util.Map;

public class MemberOneSearchController implements MemberControllableMap {
    private final MemberService service = MemberService.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        System.out.print("회원의 No을 입력해 주세요 : ");
        String read = InputView.read();
        Member findMember = service.findNOne(Long.parseLong(read));
        model.put("member", findMember);
        return "searchMember";
    }
}
