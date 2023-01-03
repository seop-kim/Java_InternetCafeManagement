package com.seop.cafe.controller.item;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Item;
import com.seop.cafe.service.ItemService;
import java.util.List;
import java.util.Map;

public class ItemSearchFunction implements IFunctionModel {
    private final ItemService service = new ItemService();
    private static final String PATH = "itemSearchItems";

    @Override
    public String process(Map<String, Object> model) {
        List<Item> findItems = service.findAll();
        model.put("items", findItems);
        return PATH;
    }
}
