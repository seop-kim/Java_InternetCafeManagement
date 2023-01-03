package com.seop.cafe.init;

import com.seop.cafe.domain.Item;
import com.seop.cafe.domain.ItemCategory;
import com.seop.cafe.service.ItemService;

public class ItemTestData {
    private static final ItemService service = new ItemService();

    public static void init() {
        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.setName("item" + i);
            item.setCategory(ItemCategory.SNACK);
            item.setPrice(5000 + i);
            item.setStock(100 + i);
            service.add(item);
        }
    }
}
