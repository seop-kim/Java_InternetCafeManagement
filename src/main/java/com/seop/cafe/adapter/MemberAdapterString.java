package com.seop.cafe.adapter;

import com.seop.cafe.controller.member.IFMemberFunctionPath;
import com.seop.cafe.view.member.MemberViewModel;

public class MemberAdapterString implements MemberAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof IFMemberFunctionPath;
    }

    @Override
    public MemberViewModel process(Object controller) {
        IFMemberFunctionPath controllable = (IFMemberFunctionPath) controller;
        String viewPath = controllable.process();
        return new MemberViewModel(viewPath);
    }
}
