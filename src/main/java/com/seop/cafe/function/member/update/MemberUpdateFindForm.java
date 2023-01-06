package com.seop.cafe.function.member.update;

import com.seop.cafe.controller.common.IFunctionPath;

public class MemberUpdateFindForm implements IFunctionPath {
    private static final String MEMBER_UPDATE_FIND_FORM_PATH = "MEMBER_UPDATE_FIND_FORM";
    @Override
    public String process() {
        return MEMBER_UPDATE_FIND_FORM_PATH;
    }
}
