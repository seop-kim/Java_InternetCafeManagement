package com.seop.cafe.view.product;

import com.seop.cafe.domain.Product;
import com.seop.cafe.view.Viewable;
import java.util.List;
import java.util.Map;

public class ProductSearchCategoryView implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        List<Product> items = (List<Product>) model.get("items");
        items.forEach(System.out::println);
    }
}
