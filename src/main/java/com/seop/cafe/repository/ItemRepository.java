package com.seop.cafe.repository;

import com.seop.cafe.domain.Item;
import com.seop.cafe.domain.ItemCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRepository {
    private static final Map<Long, Item> items = new HashMap<>();
    private static Long no = 0L;

    private static final ItemRepository instance = new ItemRepository();

    private ItemRepository() {
    }

    public static ItemRepository getInstance() {
        return instance;
    }

    public Item save(Item item) {
        item.setNo(++no);
        items.put(item.getNo(), item);
        return item;
    }

    public Item findOne(Long no) {
        return items.get(no);
    }

    public List<Item> findCategory(ItemCategory category) {
        List<Item> findItems = new ArrayList<>();
        for (Item item : items.values()) {
            if (item.getCategory() == category) {
                findItems.add(item);
            }
        }
        return findItems;
    }

    public Item findName(String name) {
        for (Item item : items.values()) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public List<Item> findAll() {
        return new ArrayList<>(items.values());
    }

    public Item deleteItem(Long no) {
        return items.remove(no);
    }

    public void clear() {
        no = 0L;
        items.clear();
    }
}
