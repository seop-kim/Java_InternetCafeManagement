package com.seop.cafe.repository;

import static com.seop.cafe.domain.ProductCategory.DRINK;
import static com.seop.cafe.domain.ProductCategory.RAMEN;
import static com.seop.cafe.domain.ProductCategory.SNACK;
import static org.assertj.core.api.Assertions.assertThat;

import com.seop.cafe.domain.Product;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {
    private static final ProductRepository repository = ProductRepository.getInstance();


    @BeforeEach
    void setup() {
        createItem();
    }

    @AfterEach
    void clean() {
        repository.clear();
    }

    @DisplayName("전체 조회")
    @Test
    void findAll() {
        // given
        int result = 4;

        // when
        List<Product> findAllItem = repository.findAll();
        int answer = findAllItem.size();

        // then
        assertThat(answer)
                .isEqualTo(result);
    }

//    @DisplayName("코카콜라 조회")
//    @Test
//    void findName() {
//        // given
//        String name = "코카콜라";
//
//        // when
//        List<Product> findItem = repository.findName(name);
//
//        // then
//        assertThat(findItem.getName())
//                .isEqualTo(name);
//    }
//
//    @DisplayName("코카콜라 삭제")
//    @Test
//    void deleteItem() {
//        // given
//        String name = "코카콜라";
//        List<Product> findItem = repository.findName(name);
//
//        // when
//        Product item = repository.deleteItem(findItem.getNo());
//
//        // then
//        assertThat(item)
//                .isEqualTo(findItem);
//    }

    @DisplayName("음료 카테고리 조회")
    @Test
    void findCategory() {
        // given
        int result = 2;
        // when
        List<Product> findItems = repository.findCategory(DRINK);
        int findItemsSize = findItems.size();

        // then
        assertThat(findItemsSize)
                .isEqualTo(result);
    }


    void createItem() {
        Product item = new Product();
        item.setName("계란과자");
        item.setCategory(SNACK);
        item.setPrice(1_500);
        item.setStock(10);
        repository.save(item);

        item = new Product();
        item.setName("코카콜라");
        item.setCategory(DRINK);
        item.setPrice(2_000);
        item.setStock(10);
        repository.save(item);

        item = new Product();
        item.setName("사이다");
        item.setCategory(DRINK);
        item.setPrice(2_000);
        item.setStock(10);
        repository.save(item);

        item = new Product();
        item.setName("안성탕면");
        item.setCategory(RAMEN);
        item.setPrice(3_500);
        item.setStock(10);
        repository.save(item);
    }
}