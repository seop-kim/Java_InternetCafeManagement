package com.seop.cafe.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PcPlan {
    Long no;
    String name;
    PcPlanCategory category;
    int time;
    int price;

    public void updatePrice(int price) {
        this.price = price;
    }

    public void updateTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PcPlan{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}
