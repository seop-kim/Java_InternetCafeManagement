package com.seop.cafe.controller.member;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.Map;

public class MemberController implements IMainControllable {
    private static final Adapter adapters = Adapter.getInstance();

    public void process() {
        MemberController controller = new MemberController();
        String path = "MEMBER_SELECT_FORM";
        controller.mapping(path);
    }

    @Override
    public void mapping(String path) {
        Object controller = MemberCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    @Override
    public void mapping(String path, Map<String, Object> model) {
        Object controller = MemberCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller, model);
        viewModel.render();
    }
}
