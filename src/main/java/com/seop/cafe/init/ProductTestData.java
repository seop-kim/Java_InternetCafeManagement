package com.seop.cafe.init;

import static com.seop.cafe.domain.ProductCategory.*;

import com.seop.cafe.domain.Product;
import com.seop.cafe.domain.ProductCategory;
import com.seop.cafe.service.ProductService;

public class ProductTestData {
    private static final ProductService service = new ProductService();

    private static String[] names = {"신라면", "안성탕면", "코카콜라", "펩시콜라", "사이다", "썬칩", "감자칩", "건빵", "생수", "바나나우유"};
    private static ProductCategory[] category = {RAMEN, RAMEN, DRINK, DRINK, DRINK, SNACK, SNACK, SNACK, DRINK, DRINK};
    private static int[] price = {2500, 2500, 1500, 1500, 1500, 2000, 2000, 1000, 800, 1400};
    private static int[] stock = {50, 50, 100, 100, 80, 30, 30, 10, 100, 50};

    public static void init() {
        for (int i = 0; i < 10; i++) {
            Product item = new Product();
            item.setName(names[i]);
            item.setCategory(category[i]);
            item.setPrice(price[i]);
            item.setStock(stock[i]);
            service.add(item);
        }
    }
}
