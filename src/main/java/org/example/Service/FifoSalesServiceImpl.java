package org.example.Service;

import org.example.Models.Customer;
import org.example.Models.Product;

import java.util.LinkedList;
import java.util.Queue;

import static org.example.Models.Store.customerList;

public class FifoSalesServiceImpl implements SalesService {
    public static Queue<Customer> fifoQueue = new LinkedList<>();
    @Override
    public void addToQueue() {
        for(Customer customer : customerList) {
            fifoQueue.offer(customer);
        }
//        System.out.println("OFFER");
//        System.out.println(fifoQueue);
    }

    @Override
    public void removeFromQueue() {
        for(Customer customer : customerList) {
            for(Product product : customer.getCartItems()) {
                int quantity = product.getQuantity();
                int newAvailableUnit = Integer.parseInt(product.getAvailableUnit()) - quantity;
                product.setAvailableUnit(String.valueOf(newAvailableUnit));
            }
//            System.out.println("POLL");
//            System.out.println(fifoQueue.poll());

        }
    }






}
