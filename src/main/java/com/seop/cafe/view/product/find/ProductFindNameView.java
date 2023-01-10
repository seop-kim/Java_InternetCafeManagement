package com.seop.cafe.view.product.find;

import com.seop.cafe.domain.Product;
import com.seop.cafe.view.Viewable;
import java.util.List;
import java.util.Map;

public class ProductFindNameView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        List<Product> items = (List<Product>) model.get("products");
        items.forEach(System.out::println);
    }
}
