package org.example.Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Models.Store.productGroup;

public class Inventory {

    // TODO: price and available unit run as string but not as double/int

    public void InventoryItems() {
        String path = "/Users/mabookpro/IdeaProjects/Week-3-Task/src/main/resources/ProductList.csv";
        List<String[]> newStock;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            newStock = bufferedReader.lines().map(line -> line.split(",")).collect(Collectors.toList());

            for(int i = 1; i < newStock.size(); i++) {
                Product product = new Product();
                product.setProductGroupId(String.valueOf(i));
                String[] productDescription = newStock.get(i)[1].split("-");
                product.setProductColor(productDescription[0]);
                product.setProductName(productDescription[1]);
                product.setProductSize(productDescription[2]);
                product.setPrice(newStock.get(i)[2]);
                product.setAvailableUnit(newStock.get(i)[3]);
                productGroup.put(i, product);
            }

//            AtomicInteger i = new AtomicInteger();
//            newStock.stream().skip(1).forEach((item) -> {
//                Product product = new Product();
//                product.setProductGroupId(String.valueOf(i.get()));
//                String[] productDescription = item[1].split("-");
//                product.setProductColor(productDescription[0]);
//                product.setProductName(productDescription[1]);
//                product.setProductSize(productDescription[2]);
//                product.setPrice(item[2]);
//                product.setAvailableUnit(item[3]);
//                productGroup.put(i.get(), product);
//                i.getAndIncrement();
//            });
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
