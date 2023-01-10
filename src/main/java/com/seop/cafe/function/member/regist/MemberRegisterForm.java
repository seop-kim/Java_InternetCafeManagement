package com.seop.cafe.function.member.regist;

import com.seop.cafe.controller.common.IFunctionPath;

public class MemberRegisterForm implements IFunctionPath {
    private static final String PATH = "MEMBER_REGI_FORM";
    @Override
    public String process() {
        return PATH;
    }
}
