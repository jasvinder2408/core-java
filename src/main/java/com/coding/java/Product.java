package com.coding.java;

public class Product implements Comparable<Product>{

    private String name;
    private int rating;
    private double price;


    public Product(String name, int rating, int price){
        this.name= name;
        this.rating=rating;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getRating()-o.getRating();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
