package com.seop.cafe.controller.product;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.function.product.ProductCategorySearchFunction;
import com.seop.cafe.function.product.ProductDeleteFunction;
import com.seop.cafe.function.product.ProductNameSearchFunction;
import com.seop.cafe.function.product.ProductSearchFunction;
import com.seop.cafe.function.product.ProductUpdateFunction;
import com.seop.cafe.function.product.ProductAddFunction;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class ProductController implements IMainControllable {
    private static final Map<String, Object> controllers = new HashMap<>();
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "0";
    private static final String SELECT_ITEM_MENU = "1 재고등록\t2 전체조회\t3 이름 조회\t4 카테고리검색\t5 재고 수정(미구현)\t6 재고 삭제\t" + END + " 뒤로";

    public ProductController() {
        controllers.put("1", new ProductAddFunction());
        controllers.put("2", new ProductSearchFunction());
        controllers.put("3", new ProductNameSearchFunction());
        controllers.put("4", new ProductCategorySearchFunction());
        controllers.put("5", new ProductUpdateFunction());
        controllers.put("6", new ProductDeleteFunction());
        controllers.put(END, new EndFunction());
    }

    @Override
    public void process() {
        ProductController controller = new ProductController();

        String select = "1000";
        while (!select.equals(END)) {
            System.out.println(SELECT_ITEM_MENU);
            select = InputView.read();
            controller.service(select);
        }
    }

    public void service(String path) {
        Object controller = controllers.get(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }
}
