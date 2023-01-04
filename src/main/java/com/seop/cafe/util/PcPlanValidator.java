package com.seop.cafe.util;

import com.seop.cafe.domain.PcPlan;

public class PcPlanValidator {
    private PcPlan plan = new PcPlan();

    public void addPlan(PcPlan plan) {
        this.plan = plan;
        nameValidate();
        categoryValidate();
        timeValidate();
        priceValidate();
    }

    private void nameValidate() {
        nameLenZero();
    }

    private void nameLenZero() {
        if (plan.getName().length() <= 0 || plan.getName() == null) {
            throw new IllegalArgumentException("요금제 이름은 필수 값 입니다");
        }
    }

    private void categoryValidate() {
        if (plan.getCategory() == null) {
            throw new IllegalArgumentException("구분은 필수 값 입니다");
        }
    }

    private void timeValidate() {
        if (plan.getTime() <= 0) {
            throw new IllegalArgumentException("시간은 최소 1시간 부터 등록이 가능합니다.");
        }
    }

    private void priceValidate() {
        if (plan.getPrice() <= 0) {
            throw new IllegalArgumentException("시간은 최소 1시간 부터 등록이 가능합니다.");
        }
    }

}
