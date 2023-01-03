package com.seop.cafe.adapter;

import com.seop.cafe.controller.member.IFMemberFunctionModel;
import com.seop.cafe.view.member.MemberViewModel;
import java.util.HashMap;
import java.util.Map;

public class MemberAdapterMap implements MemberAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof IFMemberFunctionModel;
    }

    @Override
    public MemberViewModel process(Object controller) {
        IFMemberFunctionModel controllable = (IFMemberFunctionModel) controller;
        Map<String, Object> model = new HashMap<>();
        String viewPath = controllable.process(model);
        return new MemberViewModel(viewPath, model);
    }
}
