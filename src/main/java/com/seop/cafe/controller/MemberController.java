package com.seop.cafe.controller;

import com.seop.cafe.adapter.ControllerV3Adapter;
import com.seop.cafe.adapter.ControllerV4Adapter;
import com.seop.cafe.adapter.MemberAdapter;
import com.seop.cafe.controller.detail.MainControllable;
import com.seop.cafe.controller.detail.member.MemberDeleteController;
import com.seop.cafe.controller.detail.member.MemberEndController;
import com.seop.cafe.controller.detail.member.MemberNameSearchController;
import com.seop.cafe.controller.detail.member.MemberOneSearchController;
import com.seop.cafe.controller.detail.member.MemberRegisterController;
import com.seop.cafe.controller.detail.member.MemberSearchController;
import com.seop.cafe.view.InputView;
import com.seop.cafe.view.detail.member.MemberViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberController implements MainControllable {
    private static final Map<String, Object> controllers = new HashMap<>();
    private final List<MemberAdapter> adapters = new ArrayList<>();
    private static final String END = "6";
    private static final String MEMBER_MENU = "1 회원등록\t2 전체조회\t3 이름 조회\t4 No 조회\t5 회원 삭제\t" + END + " 뒤로";
    private static final String MEMBER_ADAPTER_EXCEPTION_MSG = "일치하는 어댑터를 찾을 수 없습니다.";


    public MemberController() {
        initController();
        initAdapter();
    }

    private void initController() {
        controllers.put("1", new MemberRegisterController());
        controllers.put("2", new MemberSearchController());
        controllers.put("3", new MemberNameSearchController());
        controllers.put("4", new MemberOneSearchController());
        controllers.put("5", new MemberDeleteController());
        controllers.put(END, new MemberEndController());
    }

    private void initAdapter() {
        adapters.add(new ControllerV3Adapter());
        adapters.add(new ControllerV4Adapter());
    }

    public void process() {
        MemberController controller = new MemberController();

        String select = "0";
        while (!select.equals(END)) {
            System.out.println(MEMBER_MENU);
            select = InputView.read();
            controller.service(select);
        }
    }

    public void service(String path) {
        Object controller = controllers.get(path);
        MemberAdapter adapter = findAdapter(controller);
        MemberViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    private MemberAdapter findAdapter(Object controller) {
        for (MemberAdapter adapter : adapters) {
            if (adapter.isSupport(controller)) {
                return adapter;
            }
        }
        throw new IllegalArgumentException(MEMBER_ADAPTER_EXCEPTION_MSG);
    }
}
