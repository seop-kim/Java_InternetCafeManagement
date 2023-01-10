package com.seop.cafe.function.product;

import com.seop.cafe.controller.common.IFunctionModel;
import java.util.Map;

public class ProductUpdateFunction implements IFunctionModel {
    private static final String PATH = "itemUpdate";

    @Override
    public String process(Map<String, Object> model) {
        return PATH;
    }
}
