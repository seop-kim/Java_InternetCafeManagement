package com.seop.cafe.domain;

public enum OrderCategory {
    SET_PLAN("정액제"),
    SINGLE_PLAN("단일제");

    private final String category;
    OrderCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }
}
