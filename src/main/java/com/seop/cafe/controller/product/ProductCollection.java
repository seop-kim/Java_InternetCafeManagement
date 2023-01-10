package com.seop.cafe.controller.product;

import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.function.product.add.ProductAddFunction;
import com.seop.cafe.function.product.delete.ProductFindDeleteForm;
import com.seop.cafe.function.product.find.ProductCategorySearchFunction;
import com.seop.cafe.function.product.delete.ProductDeleteFunction;
import com.seop.cafe.function.product.find.ProductNameSearchFunction;
import com.seop.cafe.function.product.find.ProductSearchFunction;
import com.seop.cafe.function.product.update.ProductUpdateFunction;

public enum ProductCollection {

    PRODUCT_SELECT_ADD("1", new ProductAddFunction()),
    PRODUCT_SELECT_FIND_ALL("2", new ProductSearchFunction()),
    PRODUCT_SELECT_FIND_NAME("3", new ProductNameSearchFunction()),
    PRODUCT_SELECT_FIND_CATEGORY("4", new ProductCategorySearchFunction()),
    PRODUCT_SELECT_UPDATE("5", new ProductUpdateFunction()),
    PRODUCT_SELECT_DELETE("6", new ProductFindDeleteForm()),
    PRODUCT_SELECT_END("0", new EndFunction()),

    PRODUCT_DELETE_FUNCTION("PRODUCT_DELETE_FUNCTION", new ProductDeleteFunction());

    private final String path;
    private final Object function;

    ProductCollection(String path, Object function) {
        this.path = path;
        this.function = function;
    }

    public static Object getFunction(String path) {
        for (ProductCollection controller : values()) {
            if (controller.path.equals(path)) {
                return controller.function;
            }
        }
        throw new IllegalArgumentException("[ProductController] 찾는 기능이 없습니다.");
    }
}
