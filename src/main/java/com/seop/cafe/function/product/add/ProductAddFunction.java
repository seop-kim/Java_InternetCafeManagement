package com.seop.cafe.function.product.add;

import com.seop.cafe.controller.common.IFunctionModel;
import com.seop.cafe.domain.Product;
import com.seop.cafe.domain.ProductCategory;
import com.seop.cafe.service.ProductService;
import com.seop.cafe.view.common.InputView;
import java.util.Map;

public class ProductAddFunction implements IFunctionModel {
    private final ProductService service = new ProductService();
    private static final String PATH = "itemAdd";


    @Override
    public String process(Map<String, Object> model) {
        Product item = addItem();
        Product addItem = service.add(item);
        model.put("item", addItem);
        return PATH;
    }

    private Product addItem() {
        Product item = new Product();
        String read = "";
        System.out.print("상품명을 입력해 주세요 : ");
        read = InputView.read();
        item.setName(read);

        System.out.println("상품 카테고리를 선택해 주세요");
        System.out.println("1 과자\t2 음료\t3 라면");
        read = InputView.read();
        ProductCategory selectCategory = selectCategory(read);
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

    private ProductCategory selectCategory(String read) {
        return ProductCategory.getCategory(read);
    }

    private void numberFormatValidate(String read) {
        try {
            Integer.parseInt(read);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력이 가능합니다.");
        }
    }
}
