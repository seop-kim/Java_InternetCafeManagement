package com.seop.cafe.view.product;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class ProductAddView implements Viewable {
    private static final String ITEM_ADD_COMP_MSG = "[재고 등록 완료]";
    @Override
    public void render(Map<String, Object> model) {
        System.out.println(ITEM_ADD_COMP_MSG);
        System.out.println(model.get("item"));
    }
}
