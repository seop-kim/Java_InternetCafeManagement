package com.seop.cafe.controller.detail.member;

import java.util.Map;

@FunctionalInterface
public interface MemberControllableMap {
    String process(Map<String, Object> model);
}
