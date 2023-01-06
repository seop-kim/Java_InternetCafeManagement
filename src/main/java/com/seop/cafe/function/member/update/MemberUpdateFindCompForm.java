package com.seop.cafe.function.member.update;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import java.util.Map;

public class MemberUpdateFindCompForm implements IFunctionModel {
    private final MemberService service = new MemberService();
    private static final String VIEW_PATH = "MEMBER_UPDATE_FIND_COMP_FORM";

    @Override
    public String process(Map<String, Object> model) {
        String findNo = (String) model.get("memberNo");
        Member findMember = service.findNOne(Long.parseLong(findNo));
        model.put("member", findMember);
        return VIEW_PATH;
    }
}
