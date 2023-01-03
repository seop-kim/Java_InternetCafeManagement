package com.seop.cafe.controller.common;

import java.util.Map;

@FunctionalInterface
public interface IFunctionModel {
    String process(Map<String, Object> model);
}
