package com.seop.cafe.controller.common;

public class EndFunction implements IFunctionPath {
    private static final String PATH = "end";
    @Override
    public String process() {
        return PATH;
    }
}
