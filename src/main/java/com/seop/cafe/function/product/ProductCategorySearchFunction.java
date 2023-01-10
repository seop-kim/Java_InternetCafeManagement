package com.seop.cafe.function.product;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Product;
import com.seop.cafe.domain.ProductCategory;
import com.seop.cafe.service.ProductService;
import com.seop.cafe.view.common.InputView;
import java.util.List;
import java.util.Map;

public class ProductCategorySearchFunction implements IFunctionModel {
    private final ProductService service = new ProductService();
    private static final String PATH = "itemCategorySearch";
    private static final String ITEM_REQUEST_SEARCH_CATEGORY = "조회할 카테고리를 선택해 주세요.";
    private static final String ITEM_CATEGORY_MENU = "1 과자\t2 음료\t3 라면";

    @Override
    public String process(Map<String, Object> model) {
        ProductCategory findCategory = readCategory();
        List<Product> findItems = service.findCategory(findCategory);
        model.put("items", findItems);
        return PATH;
    }

    private ProductCategory readCategory() {
        System.out.println(ITEM_REQUEST_SEARCH_CATEGORY);
        System.out.println(ITEM_CATEGORY_MENU);
        return ProductCategory.getCategory(InputView.read());
    }
}
