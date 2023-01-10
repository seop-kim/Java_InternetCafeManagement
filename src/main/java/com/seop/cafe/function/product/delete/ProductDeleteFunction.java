package com.seop.cafe.function.product.delete;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.controller.common.IFunctionPath;
import com.seop.cafe.domain.Product;
import com.seop.cafe.service.ProductService;
import com.seop.cafe.view.common.InputView;
import java.util.Map;

public class ProductDeleteFunction implements IFunctionModel {
    private final ProductService service = new ProductService();
    private static final String PATH = "PRODUCT_DELETE_VIEW";


    @Override
    public String process(Map<String, Object> model) {
        String findNo = (String) model.get("findProductNo");
        Product deleteProduct = service.findOne(Long.parseLong(findNo));
        model.put("deleteProduct", deleteProduct);
        service.delete(Long.parseLong(findNo));
        return PATH;
    }
}
