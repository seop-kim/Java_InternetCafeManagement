package com.seop.cafe.adapter;

import com.seop.cafe.controller.detail.member.MemberControllableString;
import com.seop.cafe.view.detail.member.MemberViewModel;

public class ControllerV4Adapter implements MemberAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof MemberControllableString;
    }

    @Override
    public MemberViewModel process(Object controller) {
        MemberControllableString controllable = (MemberControllableString) controller;
        String viewPath = controllable.process();
        return new MemberViewModel(viewPath);
    }
}
