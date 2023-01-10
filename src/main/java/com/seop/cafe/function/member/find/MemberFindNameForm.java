package com.seop.cafe.function.member.find;

import com.seop.cafe.controller.common.IFunctionPath;

public class MemberFindNameForm implements IFunctionPath {
    private static final String MEMBER_SEARCH_NAME_FORM_PATH = "MEMBER_SEARCH_NAME_FORM";

    @Override
    public String process() {
        return MEMBER_SEARCH_NAME_FORM_PATH;
    }
}
