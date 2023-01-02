package com.seop.cafe.adapter;

import com.seop.cafe.controller.detail.member.MemberControllableString;
import com.seop.cafe.adapter.view.detail.member.MemberViewModel;

public class MemberAdapterString implements MemberAdapter {
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
