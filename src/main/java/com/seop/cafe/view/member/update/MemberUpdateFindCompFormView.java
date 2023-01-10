package com.seop.cafe.view.member.update;

import com.seop.cafe.domain.Member;
import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class MemberUpdateFindCompFormView extends ViewForm implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        Member findMember = (Member) model.get("member");

        setup();
        super.add("member", findMember);
        super.print(findMember);
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "\n어떤 항목을 수정 하시겠습니까?\t1 이름\t2 나이\n";
        CONTROLLER = "MEMBER";
        CONTROLLER_PATH = "MEMBER_UPDATE_SELECT_HEAD";
        KEY = "pick";
    }
}
