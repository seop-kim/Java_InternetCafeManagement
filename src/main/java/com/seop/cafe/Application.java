package com.seop.cafe;


import com.seop.cafe.controller.MainController;
import com.seop.cafe.init.ItemTestData;
import com.seop.cafe.init.MemberTestData;

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

    private static void init() {
        MemberTestData.init();
        ItemTestData.init();
    }
}
