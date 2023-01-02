package com.seop.cafe.controller;

import com.seop.cafe.controller.detail.MainControllable;
import com.seop.cafe.view.InputView;
import java.util.HashMap;
import java.util.Map;

public class MainController {
    private final static Map<String, MainControllable> controllers = new HashMap<>();

    public MainController() {
        controllers.put("1", new MemberController());
    }

    public void run() {
        System.out.println("1 회원관리\t2 재고관리\t3 요금제관리");
        controllers.get(InputView.read()).process();
    }
}
