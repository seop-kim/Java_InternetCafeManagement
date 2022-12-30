package com.seop.cafe.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRole {
    Long no;
    String name;
    OrderCategory category;
    int time;
    int price;

    public void updatePrice(int price) {
        this.price = price;
    }

    public void updateTime(int time) {
        this.time = time;
    }
}
