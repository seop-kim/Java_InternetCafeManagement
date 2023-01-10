package com.seop.cafe.function.member;

import com.seop.cafe.controller.common.IFunctionPath;

public class MemberSelectForm implements IFunctionPath {
    private static final String PATH = "MEMBER_SELECT_FORM";
    @Override
    public String process() {
        return PATH;
    }
}
