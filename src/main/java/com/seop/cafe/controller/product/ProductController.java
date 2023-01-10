package com.seop.cafe.controller.product;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.controller.member.MemberCollection;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.Map;

public class ProductController implements IMainControllable {
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "0";
    private static final String SELECT_ITEM_MENU =
            "1 재고등록\t2 전체조회\t3 이름 조회\t4 카테고리검색\t5 재고 수정(미구현)\t6 재고 삭제\t" + END + " 뒤로";
    private static final String CONTOUR = "===================================================================================";

    @Override
    public void process() {
        ProductController controller = new ProductController();

        String select = "1000";
        while (!select.equals(END)) {
            System.out.println(CONTOUR + "\n" + SELECT_ITEM_MENU + "\n" + CONTOUR);
            select = InputView.read();
            controller.mapping(select);
        }
    }

    @Override
    public void mapping(String path) {
        Object controller = ProductCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    @Override
    public void mapping(String path, Map<String, Object> model) {
        Object controller = ProductCollection.getFunction(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller, model);
        viewModel.render();
    }
}
