package org.example.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

public class Store {
    public static HashMap<Integer, Product> productGroup = new HashMap<>();

    public static List<Customer> customerList = new ArrayList<>();

    public static BiFunction<Integer, Integer, Integer> newAvailableUnit = (productQuantity, oldAvailableUnit) -> oldAvailableUnit - productQuantity;

    public static String updateAvailableUnit() {
        customerList.forEach(customer -> {
            customer.getCartItems().forEach(product -> {
                product.setAvailableUnit(String.valueOf(newAvailableUnit.apply(product.getQuantity(), Integer.parseInt(product.getAvailableUnit()))));
            });
        });
        return null;
    }
}
