package com.seop.cafe.function.item;

import com.seop.cafe.controller.common.IFunctionModel;
import java.util.Map;

public class ItemUpdateFunction implements IFunctionModel {
    private static final String PATH = "itemUpdate";

    @Override
    public String process(Map<String, Object> model) {
        return PATH;
    }
}
