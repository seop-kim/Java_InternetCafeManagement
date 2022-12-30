package com.seop.cafe.domain;

public enum Category {
    SNACK("과자"),
    DRINK("음료"),
    RAMEN("라면");

    private final String category;
    Category(String category) {
        this.category = category;
    }

    public String getCategory(Category category) {
        return this.category;
    }
}
