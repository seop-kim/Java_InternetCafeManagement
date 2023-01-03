package com.seop.cafe.service;

import com.seop.cafe.domain.Item;
import com.seop.cafe.domain.ItemCategory;
import com.seop.cafe.repository.ItemRepository;
import com.seop.cafe.util.ItemValidator;
import java.util.List;

public class ItemService {
    private static final ItemRepository repository = ItemRepository.getInstance();
    private static final ItemValidator validator = new ItemValidator();
    private static final String ITEM_VALIDATE_DELETE_EXCEPTION_MSG = "존재하지 않는 재고입니다.";

    public Item add(Item item) {
        validator.itemAddValidator(item);
        return repository.save(item);
    }

    public Item findOne(Long no) {
        return repository.findOne(no);
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

    public List<Item> findName(String name) {
        return repository.findName(name);
    }

    public List<Item> findCategory(ItemCategory category) {
        return repository.findCategory(category);
    }
    public void delete(Long no) {
        deleteValidate(no);
        repository.deleteItem(no);
    }

    private void deleteValidate(Long no) {
        Item findItem = repository.findOne(no);
        if (findItem == null) {
            throw new IllegalArgumentException(ITEM_VALIDATE_DELETE_EXCEPTION_MSG);
        }
    }
}
