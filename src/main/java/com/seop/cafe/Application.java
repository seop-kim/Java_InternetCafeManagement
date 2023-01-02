package com.seop.cafe;

import static com.seop.cafe.MemberTestData.*;

import com.seop.cafe.controller.MainController;

public class Application {
    public static void main(String[] args) {
        System.out.println("GOOD LUCK!");
        // TODO
        init();
        MainController controller = new MainController();
        while (true) {
            controller.run();
        }
    }
}
