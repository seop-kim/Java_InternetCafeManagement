package com.seop.cafe.adapter;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.view.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class AdapterModel implements IAdapter {
    @Override
    public boolean isSupport(Object controller) {
        return controller instanceof IFunctionModel;
    }

    @Override
    public ViewModel process(Object controller) {
        IFunctionModel controllable = (IFunctionModel) controller;
        Map<String, Object> model = new HashMap<>();
        String viewPath = controllable.process(model);
        return new ViewModel(viewPath, model);
    }
}
