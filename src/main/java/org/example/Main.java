package org.example;

import org.example.Models.Customer;
import org.example.Models.Inventory;
import org.example.Service.PriorityQueueSalesServiceImpl;

import static org.example.Models.Store.customerList;
import static org.example.Service.QueueFunctional.addCustomerToQueue;

public class Main {
    public static void main(String[] args) {
//        System.out.println("=======Products in Inventory========");
        Inventory inventory = new Inventory();
        inventory.InventoryItems();


        System.out.println("================What the customer wants============================");
        System.out.println("DAVID'S ORDER");

        //TDO: It's printing the previous product twice
        Customer david = new Customer("David");
        david.selectProducts(david, 5, 12);
        david.selectProducts(david, 3, 60);
        david.selectProducts(david, 1, 15);
        customerList.add(david);


//        System.out.println("-===================------------==================");


        System.out.println("JERRY'S ORDER");
        Customer jerry = new Customer("Jerry");
        jerry.selectProducts(jerry, 2, 84);
        jerry.selectProducts(jerry, 6, 30);
        customerList.add(jerry);
        System.out.println("///////////////");
        addCustomerToQueue();
        System.out.println("///////////////");




//        System.out.println("=--=============--=-----------------------");
//        FifoSalesServiceImpl fifoSalesService = new FifoSalesServiceImpl();
//        fifoSalesService.addToQueue();
//        fifoSalesService.removeFromQueue();

        System.out.println("=--=============--=-----------------------");

        PriorityQueueSalesServiceImpl priorityQueueSalesService = new PriorityQueueSalesServiceImpl();
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
        priorityQueueSalesService.addToQueue();
        priorityQueueSalesService.removeFromQueue();








    }
}