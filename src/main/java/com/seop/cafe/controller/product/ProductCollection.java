package com.seop.cafe.controller.product;

import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.function.product.add.ProductAddFunction;
import com.seop.cafe.function.product.delete.ProductDeleteFunction;
import com.seop.cafe.function.product.delete.ProductFindDeleteForm;
import com.seop.cafe.function.product.find.ProductCategorySearchFunction;
import com.seop.cafe.function.product.find.ProductFindNameForm;
import com.seop.cafe.function.product.find.ProductFindNameFunction;
import com.seop.cafe.function.product.find.ProductSearchFunction;
import com.seop.cafe.function.product.update.ProductUpdateFunction;

public enum ProductCollection {

    PRODUCT_SELECT_ADD("1", new ProductAddFunction()),
    PRODUCT_SELECT_FIND_ALL("2", new ProductSearchFunction()),
    PRODUCT_FIND_NAME_FORM("3", new ProductFindNameForm()),
    PRODUCT_SELECT_FIND_CATEGORY("4", new ProductCategorySearchFunction()),
    PRODUCT_SELECT_UPDATE("5", new ProductUpdateFunction()),
    PRODUCT_SELECT_DELETE_FORM("6", new ProductFindDeleteForm()),
    PRODUCT_SELECT_END("0", new EndFunction()),

    PRODUCT_DELETE_FUNCTION("PRODUCT_DELETE_FUNCTION", new ProductDeleteFunction()),
    PRODUCT_FIND_NAME_FUNCTION("PRODUCT_FIND_NAME_FUNCTION", new ProductFindNameFunction());

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
