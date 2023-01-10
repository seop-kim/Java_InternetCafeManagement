package com.seop.cafe.controller;

import java.util.Map;

@FunctionalInterface
public interface IMainControllable {
    void process();

    default void mapping(String path){}

    default void mapping(String path, Map<String, Object> model) {}
}
