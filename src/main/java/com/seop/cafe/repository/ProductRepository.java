package com.seop.cafe.repository;

import com.seop.cafe.domain.Product;
import com.seop.cafe.domain.ProductCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static final Map<Long, Product> products = new HashMap<>();
    private static Long no = 0L;

    private static final ProductRepository instance = new ProductRepository();

    private ProductRepository() {
    }

    public static ProductRepository getInstance() {
        return instance;
    }

    public Product save(Product product) {
        product.setNo(++no);
        products.put(product.getNo(), product);
        return product;
    }

    public Product findOne(Long no) {
        return products.get(no);
    }

    public List<Product> findCategory(ProductCategory category) {
        List<Product> findProducts = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getCategory() == category) {
                findProducts.add(product);
            }
        }
        return findProducts;
    }

    public List<Product> findName(String name) {
        List<Product> findProducts = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().contains(name)) {
                findProducts.add(product);
            }
        }
        return findProducts;
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product deleteItem(Long no) {
        return products.remove(no);
    }

    public void clear() {
        no = 0L;
        products.clear();
    }
}
