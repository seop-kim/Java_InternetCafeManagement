package com.seop.cafe.view.product;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class ProductUpdateView implements Viewable {
    private static final String ITEM_NO_IMPL_FUNCTION = "미구현 기능입니다.";

    @Override
    public void render(Map<String, Object> model) {
        System.out.println(ITEM_NO_IMPL_FUNCTION);
    }
}
