package com.seop.cafe.function.product.find;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Product;
import com.seop.cafe.service.ProductService;
import com.seop.cafe.view.common.InputView;
import java.util.List;
import java.util.Map;

public class ProductFindNameFunction implements IFunctionModel {
    private final ProductService service = new ProductService();
    private static final String PATH = "PRODUCT_FIND_NAME_VIEW";

    @Override
    public String process(Map<String, Object> model) {
        String findName = (String) model.get("findProductName");
        List<Product> findItems = service.findName(findName);
        model.put("products", findItems);
        return PATH;
    }
}
