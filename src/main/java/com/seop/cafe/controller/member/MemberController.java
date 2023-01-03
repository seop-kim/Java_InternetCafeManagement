package com.seop.cafe.controller.member;

import com.seop.cafe.adapter.MemberAdapterMap;
import com.seop.cafe.adapter.MemberAdapterString;
import com.seop.cafe.adapter.MemberAdapter;
import com.seop.cafe.controller.MainControllable;
import com.seop.cafe.view.InputView;
import com.seop.cafe.view.member.MemberViewModel;
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
        controllers.put("1", new MemberRegisterFunction());
        controllers.put("2", new MemberSearchFunction());
        controllers.put("3", new MemberNameSearchFunction());
        controllers.put("4", new MemberOneSearchFunction());
        controllers.put("5", new MemberDeleteFunction());
        controllers.put(END, new MemberEndFunction());
    }

    private void initAdapter() {
        adapters.add(new MemberAdapterMap());
        adapters.add(new MemberAdapterString());
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
