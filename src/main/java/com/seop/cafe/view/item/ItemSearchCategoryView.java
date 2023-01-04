package com.seop.cafe.view.item;

import com.seop.cafe.domain.Item;
import com.seop.cafe.view.Viewable;
import java.util.List;
import java.util.Map;

public class ItemSearchCategoryView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        List<Item> items = (List<Item>) model.get("items");
        items.forEach(System.out::println);
    }
}
