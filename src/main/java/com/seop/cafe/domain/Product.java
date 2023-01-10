package com.seop.cafe.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    Long no;
    String name;
    ProductCategory category;
    int price;
    int stock;

    public void updatePrice(int price) {
        priceValidate(price);
        this.price = price;
    }

    public void inStock(int count) {
        stock += count;
    }

    public void outStock(int count) {
        stockValidate(count);
        stock -= count;
    }

    private void priceValidate(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("0원보다 작은 값을 입력할 수 없습니다.");
        }
    }

    private void stockValidate(int count) {
        if (stock - count < 0) {
            throw new IllegalArgumentException("현재 재고를 초과한 수량을 내보낼 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
