package com.seop.cafe.function.member.update;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Member;
import com.seop.cafe.service.MemberService;
import java.util.HashMap;
import java.util.Map;

public class MemberUpdateFunction implements IFunctionModel {
    private static final String VIEW_PATH = "MEMBER_UPDATE_COMP_FORM";
    private static final String UPDATE_PICK_NAME = "1";
    private static final String UPDATE_PICK_AGE = "2";


    @Override
    public String process(Map<String, Object> model) {
        Member updateMember = update(model);
        model.put("updateMember", updateMember);
        return VIEW_PATH;
    }

    private Member update(Map<String, Object> model) {
        Member member = (Member) model.get("member");
        String pick = (String) model.get("pick");
        String value = (String) model.get("answer");

        if (pick.equals(UPDATE_PICK_NAME)) {
            member.setName(value);
            return member;
        }
        if (pick.equals(UPDATE_PICK_AGE)) {
            member.setAge(Integer.parseInt(value));
            return member;
        }

        throw new IllegalArgumentException("입력에서 예상치 못한 오류 발생");
    }
}
