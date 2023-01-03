package com.seop.cafe.controller.member;

public class MemberEndFunction implements IFMemberFunctionPath {
    private static final String PATH = "end";
    @Override
    public String process() {
        return PATH;
    }
}
