package com.seop.cafe.function.product;

import com.seop.cafe.controller.common.IFunctionPath;
import com.seop.cafe.service.ProductService;
import com.seop.cafe.view.common.InputView;

public class ProductDeleteFunction implements IFunctionPath {
    private final ProductService service = new ProductService();
    private static final String ITEM_REQUEST_DELETE_ITEM_NAME = "삭제할 제품 코드를 입력해 주세요 : ";
    private static final String PATH = "itemDelete";

    @Override
    public String process() {
        System.out.print(ITEM_REQUEST_DELETE_ITEM_NAME);
        String code = InputView.read();
        service.delete(Long.parseLong(code));
        return PATH;
    }
}
