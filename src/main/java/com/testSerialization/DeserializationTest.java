package com.testSerialization;

import com.testSerialization.pojo.ShoppingCart;

import java.io.*;

public class DeserializationTest {
    public static void main(String[] args) {
        ShoppingCart cart = null;
        String directory = "./";
        String cartId = "";
        System.out.println("Enter the cart id to read the object : ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = br.readLine();
        } catch (IOException e) {
            System.exit(-1);
        }
        String cartFileName = directory + cartId + ".ser";

        try (FileInputStream fis = new FileInputStream(cartFileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            cart = (ShoppingCart) ois.readObject();
        } catch (IOException e) {
            System.out.println("Error reading cart file");
            System.exit(-1);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(-1);
        }

        System.out.println("The read object is "+cart);

    }
}
