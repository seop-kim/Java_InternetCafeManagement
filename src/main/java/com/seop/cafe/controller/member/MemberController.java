package com.seop.cafe.controller.member;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.function.member.MemberDeleteFunction;
import com.seop.cafe.function.member.MemberNameSearchFunction;
import com.seop.cafe.function.member.MemberOneSearchFunction;
import com.seop.cafe.function.member.MemberRegisterFunction;
import com.seop.cafe.function.member.MemberSearchFunction;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class MemberController implements IMainControllable {
    private static final Map<String, Object> controllers = new HashMap<>();
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "6";
    private static final String SELECT_MEMBER_MENU = "1 회원등록\t2 전체조회\t3 이름 조회\t4 No 조회\t5 회원 삭제\t" + END + " 뒤로";


    public MemberController() {
        initController();
    }

    private void initController() {
        controllers.put("1", new MemberRegisterFunction());
        controllers.put("2", new MemberSearchFunction());
        controllers.put("3", new MemberNameSearchFunction());
        controllers.put("4", new MemberOneSearchFunction());
        controllers.put("5", new MemberDeleteFunction());
        controllers.put(END, new EndFunction());
    }


    public void process() {
        MemberController controller = new MemberController();

        String select = "0";
        while (!select.equals(END)) {
            System.out.println(SELECT_MEMBER_MENU);
            select = InputView.read();
            controller.service(select);
        }
    }

    public void service(String path) {
        Object controller = controllers.get(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }
}
