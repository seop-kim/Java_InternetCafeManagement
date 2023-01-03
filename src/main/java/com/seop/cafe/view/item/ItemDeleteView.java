package com.seop.cafe.view.item;

import com.seop.cafe.view.Viewable;
import java.util.Map;

public class ItemDeleteView implements Viewable {
    private static final String ITEM_DELETE_COMP_MSG = "회원 정보가 삭제 되었습니다.";

    @Override
    public void render(Map<String, Object> model) {
        System.out.println(ITEM_DELETE_COMP_MSG);
    }
}
