package main.java;

import java.util.Date;

public class Product {
    private String name;
    private double price;
    private double weight;
    private ShelfLife shelf;
    private Date delivery;

    public Date getDelivery() {
        return delivery;
    }

    public ShelfLife getShelf() {
        return shelf;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\n' +
                ", price=" + price + '\n' +
                ", weight=" + weight + '\n' +
                ", shelf=" + shelf + '\n' +
                ", delivery=" + delivery +
                '}';
    }
}
