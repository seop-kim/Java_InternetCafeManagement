package com.seop.cafe.controller.member;

import java.util.Map;

@FunctionalInterface
public interface IFMemberFunctionModel {
    String process(Map<String, Object> model);
}
