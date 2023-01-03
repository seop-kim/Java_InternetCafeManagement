package com.seop.cafe.function.item;

import com.seop.cafe.controller.common.IFunctionPath;
import com.seop.cafe.service.ItemService;
import com.seop.cafe.view.common.InputView;

public class ItemDeleteFunction implements IFunctionPath {
    private final ItemService service = new ItemService();
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
