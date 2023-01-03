package com.seop.cafe.controller.member;

import com.seop.cafe.controller.common.IFunctionPath;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.service.MemberService;

public class MemberDeleteFunction implements IFunctionPath {
    private final MemberService service = new MemberService();
    private static final String PATH = "memberDelete";
    private static final String MEMBER_REQUEST_DELETE_USER_NO = "샥제할 회원의 No을 입력해 주세요 : ";

    @Override
    public String process() {
        System.out.print(MEMBER_REQUEST_DELETE_USER_NO);
        String code = InputView.read();
        service.delete(Long.parseLong(code));
        return PATH;
    }
}
