package com.testSerialization.pojo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShoppingCart implements Serializable {

    private int id;
    private final List<Item> items;

    public ShoppingCart(int id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

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

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        Date date = new Date();
        System.out.println("Serializing date as : " + date);
        out.writeObject(date);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println(this);
        System.out.println("reading shopping cart from file");
        ois.defaultReadObject();
        System.out.println("The date Field : " + ois.readObject());
    }

    @Override
    public String toString() {
        return "ShoppingCart [id=" + id + ", items=" + items + "]";
    }

}
