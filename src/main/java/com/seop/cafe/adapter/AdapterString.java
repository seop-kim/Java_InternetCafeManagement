package com.seop.cafe.adapter;

import com.seop.cafe.controller.common.IFunctionPath;
import com.seop.cafe.view.ViewModel;

public class AdapterString implements IAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof IFunctionPath;
    }

    @Override
    public ViewModel process(Object controller) {
        IFunctionPath controllable = (IFunctionPath) controller;
        String viewPath = controllable.process();
        return new ViewModel(viewPath);
    }
}
