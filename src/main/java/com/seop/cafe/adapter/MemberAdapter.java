package com.seop.cafe.adapter;

import com.seop.cafe.view.detail.member.MemberViewModel;

public interface MemberAdapter {
    boolean isSupport(Object controller);

    MemberViewModel process(Object controller);
}