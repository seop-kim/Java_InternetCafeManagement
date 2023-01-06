package com.seop.cafe.function.member.update;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.controller.common.IFunctionPath;
import java.util.Map;

public class MemberUpdateSelectHeadForm implements IFunctionModel {
    private static final String VIEW_PATH = "MEMBER_UPDATE_FORM";

    @Override
    public String process(Map<String, Object> model) {
        return VIEW_PATH;
    }
}
