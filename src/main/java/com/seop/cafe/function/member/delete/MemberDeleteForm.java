package com.seop.cafe.function.member.delete;

import com.seop.cafe.controller.common.IFunctionPath;

public class MemberDeleteForm implements IFunctionPath {
    private static final String MEMBER_DELETE_SELECT_FORM_PATH = "MEMBER_DELETE_SELECT_FORM";

    @Override
    public String process() {
        return MEMBER_DELETE_SELECT_FORM_PATH;
    }
}
