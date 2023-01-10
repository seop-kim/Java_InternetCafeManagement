package com.seop.cafe.function.product.find;

import com.seop.cafe.controller.common.IFunctionPath;

public class ProductFindNameForm implements IFunctionPath {
    private static final String PATH = "PRODUCT_FIND_NAME_FORM";

    @Override
    public String process() {
        return PATH;
    }
}
