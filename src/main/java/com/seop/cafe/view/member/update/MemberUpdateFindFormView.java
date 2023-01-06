package com.seop.cafe.view.member.update;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberUpdateFindFormView extends ViewForm implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        setup();
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        super.VIEW_FORM_TEXT = "수정할 회원의 No을 입력해 주세요 : ";
        CONTROLLER = "MEMBER";
        super.CONTROLLER_PATH = "MEMBER_UPDATE_FIND_COMP_FORM";
        super.KEY = "memberNo";
    }

}
