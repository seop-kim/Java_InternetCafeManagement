package com.seop.cafe.function.member.delete;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.service.MemberService;
import java.util.Map;

public class MemberDeleteFunction implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String VIEW_PATH = "MEMBER_DELETE_VIEW";

    @Override
    public String process(Map<String, Object> model) {
        String deleteNo = (String) model.get("findMemberNo");
        service.delete(Long.parseLong(deleteNo));
        return VIEW_PATH;
    }
}
