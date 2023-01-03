package com.seop.cafe.domain;

public enum ItemCategory {
    SNACK("1", "과자"),
    DRINK("2", "음료"),
    RAMEN("3", "라면");

    private final String no;

    private final String category;

    ItemCategory(String no, String category) {
        this.no = no;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public static ItemCategory getCategory(String no) {
        for (ItemCategory findCate : ItemCategory.values()) {
            if (findCate.no.equals(no)) {
                return findCate;
            }
        }
        throw new IllegalArgumentException("없는 카데고리 입니다.");
    }
}
