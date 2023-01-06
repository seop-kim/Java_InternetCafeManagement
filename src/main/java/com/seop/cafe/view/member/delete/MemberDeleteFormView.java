package com.seop.cafe.view.member.delete;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberDeleteFormView extends ViewForm implements Viewable {

    @Override
    public void render(Map<String, Object> model) {
        setup();
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "삭제할 회원의 NO을 입력해 주세요 : ";
        CONTROLLER = "MEMBER";
        CONTROLLER_PATH = "MEMBER_DELETE_FUNCTION";
        KEY = "findMemberNo";
    }
}
