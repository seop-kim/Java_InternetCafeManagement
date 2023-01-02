package com.seop.cafe.adapter;

import com.seop.cafe.controller.detail.member.MemberControllableMap;
import com.seop.cafe.adapter.view.detail.member.MemberViewModel;
import java.util.HashMap;
import java.util.Map;

public class MemberAdapterMap implements MemberAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof MemberControllableMap;
    }

    @Override
    public MemberViewModel process(Object controller) {
        MemberControllableMap controllable = (MemberControllableMap) controller;
        Map<String, Object> model = new HashMap<>();
        String viewPath = controllable.process(model);
        return new MemberViewModel(viewPath, model);
    }
}
