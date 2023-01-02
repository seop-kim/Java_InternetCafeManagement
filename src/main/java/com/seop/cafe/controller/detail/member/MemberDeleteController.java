package com.seop.cafe.controller.detail.member;

import com.seop.cafe.domain.service.MemberService;
import com.seop.cafe.view.InputView;

public class MemberDeleteController implements MemberControllableString {
    private final MemberService service = MemberService.getInstance();

    @Override
    public String process() {
        System.out.print("샥제할 회원의 No을 입력해 주세요 : ");
        String read = InputView.read();
        service.delete(Long.parseLong(read));
        return "delete";
    }
}
