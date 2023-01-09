package com.seop.cafe.view.member.update;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberUpdateForm extends ViewForm implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        ANSWER_MODEL = model;

        setup();
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "수정할 값을 입력해 주세요.\n";
        CONTROLLER = "MEMBER";
        CONTROLLER_PATH = "MEMBER_UPDATE_FUNCTION";
        KEY = "answer";
    }
}
