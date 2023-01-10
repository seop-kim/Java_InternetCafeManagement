package com.seop.cafe.view.product.find;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class ProductFindNameFormView extends ViewForm implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        setup();
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "검색할 제품의 이름을 입력해 주세요 : ";
        CONTROLLER = "PRODUCT";
        CONTROLLER_PATH = "PRODUCT_FIND_NAME_FUNCTION";
        KEY = "findProductName";
    }
}
