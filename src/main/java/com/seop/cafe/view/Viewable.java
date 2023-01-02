package com.seop.cafe.view;

import java.util.Map;

@FunctionalInterface
public interface Viewable {
    void render(Map<String, Object> model);
}
