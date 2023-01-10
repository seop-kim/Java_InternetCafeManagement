package com.seop.cafe.service;

import com.seop.cafe.domain.Product;
import com.seop.cafe.domain.ProductCategory;
import com.seop.cafe.repository.ProductRepository;
import com.seop.cafe.util.ProductValidator;
import java.util.List;

public class ProductService {
    private static final ProductRepository repository = ProductRepository.getInstance();
    private static final ProductValidator validator = new ProductValidator();
    private static final String ITEM_VALIDATE_DELETE_EXCEPTION_MSG = "존재하지 않는 재고입니다.";

    public Product add(Product item) {
        validator.productAddValidator(item);
        return repository.save(item);
    }

    public Product findOne(Long no) {
        return repository.findOne(no);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public List<Product> findName(String name) {
        return repository.findName(name);
    }

    public List<Product> findCategory(ProductCategory category) {
        return repository.findCategory(category);
    }
    public void delete(Long no) {
        deleteValidate(no);
        repository.deleteItem(no);
    }

    private void deleteValidate(Long no) {
        Product findItem = repository.findOne(no);
        if (findItem == null) {
            throw new IllegalArgumentException(ITEM_VALIDATE_DELETE_EXCEPTION_MSG);
        }
    }
}
