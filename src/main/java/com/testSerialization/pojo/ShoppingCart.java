package com.testSerialization.pojo;

import java.io.Serializable;
import java.util.List;

public record ShoppingCart(int id, List<Item> items) implements Serializable {

    public void addItem(Item item) {
        items.add(item);
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public int getCartSize() {
        return items.size();
    }

}
