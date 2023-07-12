package org.example.Service;

import org.example.Models.Customer;
import org.example.Models.Inventory;

import java.util.LinkedList;
import java.util.Queue;

import static org.example.Models.Store.customerList;
import static org.example.Models.Store.updateAvailableUnit;

public class QueueFunctional {

    public static Queue<Customer> fifoQueue = new LinkedList<>();

    public static void addCustomerToQueue() {
        fifoQueue.addAll(customerList);
        fifoQueue.forEach(System.out::println);
    }



    public static void removeCustomerFromQueue() {
        updateAvailableUnit();
        fifoQueue.poll();
        fifoQueue.forEach(System.out::println);
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


        System.out.println("===Add to queue===");
        addCustomerToQueue();

        System.out.println("====Remove from queue====");
        removeCustomerFromQueue();



    }


}
