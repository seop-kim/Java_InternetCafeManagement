package com.seop.cafe.function.product.delete;

import com.seop.cafe.controller.common.IFunctionPath;

public class ProductFindDeleteForm implements IFunctionPath {
    private static final String PATH = "PRODUCT_FIND_DELETE_FORM";
    @Override
    public String process() {
        return PATH;
    }
}
