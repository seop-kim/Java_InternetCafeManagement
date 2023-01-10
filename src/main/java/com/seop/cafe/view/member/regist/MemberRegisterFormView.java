package com.seop.cafe.view.member.regist;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberRegisterFormView extends ViewForm implements Viewable {
    private static final String MEMBER_REQUEST_REGI_USER_NAME = "이름을 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_AGE = "나이를 입력해 주세요 : ";
    private static final String MEMBER_REQUEST_REGI_USER_GENDER = "성별을 입력해 주세요 (1 : 남자, 2 : 여자) : ";

    @Override
    public void render(Map<String, Object> model) {
        setup();
        readMember();
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "[회원 등록]";
        CONTROLLER = "MEMBER";
        CONTROLLER_PATH = "MEMBER_REGI_FUNCTION";
    }

    private void readMember() {
        super.print(MEMBER_REQUEST_REGI_USER_NAME);
        super.add("NAME", InputView.read());
        super.print(MEMBER_REQUEST_REGI_USER_AGE);
        super.add("AGE", InputView.read());
        super.print(MEMBER_REQUEST_REGI_USER_GENDER);
        super.add("GENDER", InputView.read());
    }


}
