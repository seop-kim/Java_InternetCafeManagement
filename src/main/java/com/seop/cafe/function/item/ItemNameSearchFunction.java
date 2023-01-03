package com.seop.cafe.function.item;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Item;
import com.seop.cafe.service.ItemService;
import com.seop.cafe.view.common.InputView;
import java.util.List;
import java.util.Map;

public class ItemNameSearchFunction implements IFunctionModel {
    private final ItemService service = new ItemService();
    private static final String PATH = "itemSearchName";
    private static final String ITEM_REQUEST_SEARCH_ITEM_NAME = "제품명을 입력해 주세요 : ";

    @Override
    public String process(Map<String, Object> model) {
        System.out.print(ITEM_REQUEST_SEARCH_ITEM_NAME);
        String name = InputView.read();
        List<Item> findItems = service.findName(name);
        model.put("items", findItems);
        return PATH;
    }
}
