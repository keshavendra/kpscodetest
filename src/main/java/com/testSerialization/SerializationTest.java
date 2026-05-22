package com.testSerialization;

import com.testSerialization.pojo.Item;
import com.testSerialization.pojo.ShoppingCart;

import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

public class SerializationTest {

    public static void main(String[] args) {
        String directory = "./";
        String cartId;
        ShoppingCart shoppingCart;
        System.out.println("Enter cart id");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = br.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
            shoppingCart = new ShoppingCart(Integer.parseInt(cartId), new ArrayList<>());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        shoppingCart.addItem(new Item(101, "Duke plastic circular flying disc", 10.95f));
        shoppingCart.addItem(new Item(123, "Duke soccer pro soccer ball", 29.95f));
        shoppingCart.addItem(new Item(45, "Duke \"The Edge\" Tennis ball - 12 Ball Bag", 17.49f));

        System.out.println("Shopping cart " + cartId + " contains " + shoppingCart.getCartSize() + " items");
        System.out.println("Shopping cart total:" + NumberFormat.getCurrencyInstance().format(shoppingCart.getTotalPrice()));

        String cartFileName = directory + cartId + ".ser";

        try (FileOutputStream fos = new FileOutputStream(cartFileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(shoppingCart);
        } catch (IOException e) {
            System.out.println("Exception occurred while writing shopping cart " + cartFileName);
            System.exit(-1);
        }
        System.out.println("Shopping cart " + cartFileName + " contains " + shoppingCart.getCartSize());
    }

}
