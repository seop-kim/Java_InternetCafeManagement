package com.seop.cafe.view.product.delete;

import com.seop.cafe.view.Viewable;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.common.ViewForm;
import java.util.Map;

public class ProductDeleteFormView extends ViewForm implements Viewable {
    @Override
    public void render(Map<String, Object> model) {
        setup();
        super.print();
        super.read(InputView.read());
        super.mapping();
    }

    @Override
    protected void setup() {
        VIEW_FORM_TEXT = "삭제할 제품의 NO을 입력해 주세요 : ";
        CONTROLLER = "PRODUCT";
        CONTROLLER_PATH = "PRODUCT_DELETE_FUNCTION";
        KEY = "findProductNo";
    }
}
