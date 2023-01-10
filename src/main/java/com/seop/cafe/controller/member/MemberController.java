package com.seop.cafe.controller.member;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.Map;

public class MemberController implements IMainControllable {
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "0";
    private static final String SELECT_MEMBER_MENU = "1 회원등록\t2 전체조회\t3 이름 조회\t4 회원 수정\t5 회원 삭제\t" + END + " 뒤로";
    private static final String CONTOUR = "======================================================================";

    public void process() {
        MemberController controller = new MemberController();
        String select = "";
        while (!select.equals(END)) {
            System.out.println(CONTOUR + "\n" + SELECT_MEMBER_MENU + "\n" + CONTOUR);
            select = InputView.read();
            controller.mapping(select);
        }
    }

    public void mapping(String path) {
        Object controller = MemberCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    @Override
    public void mapping(String path, Map<String, Object> model) {
        Object controller = MemberCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller, model);
        viewModel.render();
    }
}
