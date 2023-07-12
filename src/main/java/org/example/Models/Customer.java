package org.example.Models;

import java.util.ArrayList;
import java.util.List;

import static org.example.Models.Store.productGroup;

public class Customer {

    private String name;
    private final List<Product> cartItems = new ArrayList<>();

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public List<Product> selectProducts(Customer customer, int key, int quantity) {
        try{
            Product product = productGroup.get(key);

            //TODO: Try tenary here
            if(Integer.parseInt(product.getAvailableUnit()) < quantity) {
                System.out.println("Please check the available unit on the product label and make another choice");
                return null;
            }

            product.setQuantity(quantity);
            cartItems.add(product);

        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return cartItems;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", cartItems=" + cartItems +
                '}';
    }
}



//                products.get(i).setAvailableUnit(products.get(i).getAvailableUnit() - quantity);
