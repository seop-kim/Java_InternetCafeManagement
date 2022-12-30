package com.seop.cafe.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    Long no;
    String name;
    Category category;
    int price;
    int stock;

    public void updatePrice(int price) {
        this.price = price;
    }

    public void inStock(int count) {
        stock += count;
    }

    public void outStock(int count) {
        stock -= count;
    }
}
