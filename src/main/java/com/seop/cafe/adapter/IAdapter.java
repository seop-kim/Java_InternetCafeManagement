package com.seop.cafe.adapter;

import com.seop.cafe.view.ViewModel;

public interface IAdapter {
    boolean isSupport(Object controller);

    ViewModel process(Object controller);
}
