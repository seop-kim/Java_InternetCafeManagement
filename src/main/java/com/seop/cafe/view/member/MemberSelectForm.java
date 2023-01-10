package com.seop.cafe.view.member;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberSelectForm extends ViewForm implements Viewable {
    private static final String SELECT_MEMBER_MENU = "1 회원등록\t2 전체조회\t3 이름 조회\t4 회원 수정\t5 회원 삭제\t0 뒤로";
    private static final String CONTOUR = "======================================================================";

    @Override
    public void render(Map<String, Object> model) {
        setup();
        super.print();
        function();
        super.mapping(CONTROLLER_PATH);
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = CONTOUR + "\n" + SELECT_MEMBER_MENU + "\n" + CONTOUR + "\n";
        CONTROLLER = "MEMBER";
    }

    private void function() {
        CONTROLLER_PATH = InputView.read();
    }
}
