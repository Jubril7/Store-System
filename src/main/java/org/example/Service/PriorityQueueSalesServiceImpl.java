package org.example.Service;

import org.example.Models.Customer;
import org.example.Models.Product;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.example.Models.Store.customerList;

public class PriorityQueueSalesServiceImpl implements SalesService {
    Queue<Product> salesByPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());


    @Override
    public void addToQueue() {
        for(Customer i : customerList) {
            for (Product product : i.getCartItems()){
                salesByPriorityQueue.offer(product);
            }
        }
        System.out.println(salesByPriorityQueue);
    }
    @Override
    public void removeFromQueue() {
        while(salesByPriorityQueue.peek() != null) {
            System.out.println(salesByPriorityQueue.poll());
        }
    }
}
