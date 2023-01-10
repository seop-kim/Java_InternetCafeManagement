package com.seop.cafe.view.product.delete;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class ProductDeleteView implements Viewable {
    private static final String ITEM_DELETE_COMP_MSG = "[회원삭제] ";

    @Override
    public void render(Map<String, Object> model) {
        System.out.println(ITEM_DELETE_COMP_MSG + model.get("deleteProduct"));
    }
}
