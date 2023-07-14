package org.example.Models;

import java.util.Objects;

public class Product implements Comparable<Product> {

    // TODO: price and available unit run as string but not as double/int
    private String productGroupId;
    private String productName;
    private String productSize;
    private String productColor;
    private String price;
    private String availableUnit;
    private int quantity;

    public Product() {
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailableUnit() {
        return availableUnit;
    }

    public void setAvailableUnit(String availableUnit) {
        this.availableUnit = availableUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "{" +
                "productId='" + productGroupId  + ", " +
                "productName='" + productName + ", " +
                "productSize='" + productSize  + ", " +
                "productColor='" + productColor  + ", " +
                "price='" + price  + ", " + '\n' +
                "availableUnit='" + availableUnit   + ", " +
                "quantity='" + quantity + ", " +
                '}' + '\n';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.quantity, o.getQuantity());
    }
}



//    Function<Product> compareTo = (o1) -> this.quantity - o1.getQuantity();
