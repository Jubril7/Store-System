package org.example.Service;

import org.example.Models.Customer;
import org.example.Models.Inventory;
import org.example.Models.Product;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.example.Models.Store.customerList;
import static org.example.Models.Store.updateAvailableUnit;

public class PriorityQueueFunctional {
    static Queue<Product> priorityQueueSale = new PriorityQueue<>(Collections.reverseOrder());


    public static void addProductToQueue() {
        customerList.forEach(customer -> {
            customer.getCartItems().forEach(product -> {
                priorityQueueSale.offer(product);
            });
        });
        priorityQueueSale.forEach(System.out::println);

    }


    public static void removeProductFromQueue() {
        while(priorityQueueSale.peek() != null) {
           updateAvailableUnit();
           System.out.println(priorityQueueSale.poll());
        }
    }





    public static void main(String[] args) {
        Customer debo = new Customer("Debo");
        Customer bolaji = new Customer("Bolaji");

        Inventory inventory = new Inventory();
        inventory.InventoryItems();


        debo.selectProducts(debo, 6, 12);
        debo.selectProducts(debo, 1, 60);
        debo.selectProducts(debo, 2, 15);
        customerList.add(debo);


        bolaji.selectProducts(bolaji, 3, 84);
        bolaji.selectProducts(bolaji, 5, 30);
        customerList.add(bolaji);


        System.out.println("===Add customer product to pQueue===");
        addProductToQueue();

        System.out.println("===Remove customer product based on pQueue=====");
        removeProductFromQueue();


    }
}

