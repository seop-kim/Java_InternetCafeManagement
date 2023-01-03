package com.seop.cafe.controller.item;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Item;
import com.seop.cafe.domain.ItemCategory;
import com.seop.cafe.service.ItemService;
import com.seop.cafe.view.common.InputView;
import java.util.Map;

public class ItemAddFunction implements IFunctionModel {
    private final ItemService service = new ItemService();
    private static final String PATH = "itemAdd";


    @Override
    public String process(Map<String, Object> model) {
        Item item = addItem();
        Item addItem = service.add(item);
        model.put("item", addItem);
        return PATH;
    }

    private Item addItem() {
        Item item = new Item();
        String read = "";
        System.out.print("상품명을 입력해 주세요 : ");
        read = InputView.read();
        item.setName(read);

        System.out.println("상품 카테고리를 선택해 주세요");
        System.out.println("1 과자\t2 음료\t3 라면");
        read = InputView.read();
        ItemCategory selectCategory = selectCategory(read);
        item.setCategory(selectCategory);

        System.out.print("상품의 가격을 입력해 주세요 : ");
        read = InputView.read();
        numberFormatValidate(read);
        item.setPrice(Integer.parseInt(read));

        System.out.print("상품 재고 수량을 입력해 주세요 : ");
        read = InputView.read();
        numberFormatValidate(read);
        item.setStock(Integer.parseInt(read));

        return item;
    }

    private ItemCategory selectCategory(String read) {
        return ItemCategory.getCategory(read);
    }

    private void numberFormatValidate(String read) {
        try {
            Integer.parseInt(read);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력이 가능합니다.");
        }
    }
}
