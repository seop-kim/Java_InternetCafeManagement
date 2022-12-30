package com.seop.cafe.domain;

public enum ItemCategory {
    SNACK("과자"),
    DRINK("음료"),
    RAMEN("라면");

    private final String category;
    ItemCategory(String category) {
        this.category = category;
    }

    public String getCategory(ItemCategory category) {
        return this.category;
    }
}
