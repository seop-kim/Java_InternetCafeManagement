package com.seop.cafe.controller.item;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class ItemController implements IMainControllable {
    private static final Map<String, Object> controllers = new HashMap<>();
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "0";
    private static final String SELECT_ITEM_MENU = "1 재고등록\t2 전체조회\t3 이름 조회\t4 카테고리검색\t5 재고 수정(미구현)\t6 재고 삭제\t" + END + " 뒤로";

    public ItemController() {
        controllers.put("1", new ItemAddFunction());
        controllers.put("2", new ItemSearchFunction());
        controllers.put("3", new ItemNameSearchFunction());
        controllers.put("4", new ItemCategorySearchFunction());
        controllers.put("5", new ItemUpdateFunction());
        controllers.put("6", new ItemDeleteFunction());
        controllers.put(END, new EndFunction());
    }

    @Override
    public void process() {
        ItemController controller = new ItemController();

        String select = "1000";
        while (!select.equals(END)) {
            System.out.println(SELECT_ITEM_MENU);
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
