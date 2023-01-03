package com.seop.cafe.function.item;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Item;
import com.seop.cafe.domain.ItemCategory;
import com.seop.cafe.service.ItemService;
import com.seop.cafe.view.common.InputView;
import java.util.List;
import java.util.Map;

public class ItemCategorySearchFunction implements IFunctionModel {
    private final ItemService service = new ItemService();
    private static final String PATH = "itemCategorySearch";
    private static final String ITEM_REQUEST_SEARCH_CATEGORY = "조회할 카테고리를 선택해 주세요.";
    private static final String ITEM_CATEGORY_MENU = "1 과자\t2 음료\t3 라면";

    @Override
    public String process(Map<String, Object> model) {
        ItemCategory findCategory = readCategory();
        List<Item> findItems = service.findCategory(findCategory);
        model.put("items", findItems);
        return PATH;
    }

    private ItemCategory readCategory() {
        System.out.println(ITEM_REQUEST_SEARCH_CATEGORY);
        System.out.println(ITEM_CATEGORY_MENU);
        return ItemCategory.getCategory(InputView.read());
    }
}
