package com.seop.cafe.function.product.find;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Product;
import com.seop.cafe.service.ProductService;
import java.util.List;
import java.util.Map;

public class ProductSearchFunction implements IFunctionModel {
    private final ProductService service = new ProductService();
    private static final String PATH = "itemSearchItems";

    @Override
    public String process(Map<String, Object> model) {
        List<Product> findItems = service.findAll();
        model.put("items", findItems);
        return PATH;
    }
}
