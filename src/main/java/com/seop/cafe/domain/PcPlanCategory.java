package com.seop.cafe.domain;

public enum PcPlanCategory {
    SINGLE_PRICE("1", "시간요금제"),
    SET_PRICE("2", "정액요금제");

    private final String no;
    private final String category;

    PcPlanCategory(String no, String category) {
        this.no = no;
        this.category = category;
    }

    public static PcPlanCategory getPlan(String no) {
        for (PcPlanCategory plan : PcPlanCategory.values()) {
            if (plan.no.equals(no)) {
                return plan;
            }
        }
        throw new IllegalArgumentException("요금제 구분이 없습니다.");
    }
}
