package org.example.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

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

    static BiPredicate<Integer, Integer> checkAvailabilityOfProduct = (availableQuantity, quantityRequested) -> availableQuantity < quantityRequested;

    public List<Product> selectProducts(Customer customer, int key, int quantity) {
        try{
            Product product = productGroup.get(key);

            if(checkAvailabilityOfProduct.test(Integer.parseInt(product.getAvailableUnit()), quantity)) {
                System.out.println("Please check the available unit on the product label and make another choice");
                return null;
            } else {
                product.setQuantity(quantity);
                cartItems.add(product);
            }

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
