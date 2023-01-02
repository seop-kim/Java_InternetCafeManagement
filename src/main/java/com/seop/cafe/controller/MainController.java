package com.seop.cafe.controller;

import com.seop.cafe.controller.detail.MainControllable;
import com.seop.cafe.view.InputView;
import java.util.HashMap;
import java.util.Map;

public class MainController {
    private static final Map<String, MainControllable> controllers = new HashMap<>();
    private static final String SELECT_MAIN_MENU = "1 회원관리\t2 재고관리\t3 요금제관리";

    public MainController() {
        controllers.put("1", new MemberController());
    }

    public void run() {
        System.out.println(SELECT_MAIN_MENU);
        controllers.get(InputView.read()).process();
    }
}
