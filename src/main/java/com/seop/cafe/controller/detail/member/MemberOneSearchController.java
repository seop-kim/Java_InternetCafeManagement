package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import com.seop.cafe.view.InputView;
import java.util.Map;

public class MemberOneSearchController implements MemberControllableMap {
    private final MemberService service = new MemberService();
    private static final String MEMBER_REQUEST_SEARCH_USER_NO = "회원의 No을 입력해 주세요 : ";
    private static final String PATH = "searchMember";

    @Override
    public String process(Map<String, Object> model) {
        System.out.print(MEMBER_REQUEST_SEARCH_USER_NO);
        String read = InputView.read();
        Member findMember = service.findNOne(Long.parseLong(read));
        model.put("member", findMember);
        return PATH;
    }
}
