package com.seop.cafe.util;

import com.seop.cafe.domain.Product;

public class ProductValidator {

    private Product product;

    public ProductValidator() {
    }

    public void productAddValidator(Product product) {
        this.product = product;
        nameValidate();
        categoryValidate();
        priceValidate();
        stockValidate();
    }

    private void nameValidate() {
        if (product.getName().length() == 0 || product.getName() == null) {
            throw new IllegalArgumentException("이름을 작성해 주세요.");
        }
    }

    private void categoryValidate() {
        if (product.getCategory() == null) {
            throw new IllegalArgumentException("카테고리가 없습니다.");
        }
    }

    private void priceValidate() {
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("가격은 0원 미만일 수 없습니다.");
        }
    }

    private void stockValidate() {
        if (product.getStock() < 0) {
            throw new IllegalArgumentException("수량은 0개 미만일 수 없습니다.");
        }
    }


}
