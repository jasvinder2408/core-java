package com.coding.java;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You are building E-commerce site having multiple Products.
 * 1. Sort all products on the customer rating
 * 2. Average Price of all products
 */
public class Ecommerce {


    /**
     * spring data jpa,
     * spring kafka
     * spring web
     * junit and mockito
     * actuator
     * spring data redis
     * spring cloud gateway
     * spring eureka discovery
     * spring cloud config
     *
     *
     *
     */

    private static List<Product>productList = Arrays.asList(new Product("Iphone", 5, 80000), new Product("Samsung",4, 50000),
            new Product("Airtel", 4, 40000),new Product("Motorola", 3,30000));


    public  static List<Product> sortAllProductsByRating(){

       return productList.stream()
                ///.filter(product -> product.getRating() == rating)
                .sorted(doSort())
                .collect(Collectors.toList());

    }

    private static Comparator<? super Product> doSort( ) {

        return (product1, product2)-> product1.getRating() - product2.getRating();
    }


    public  static double getAvgOfAllProducts(){

        return productList.stream()
                .map(product -> product.getPrice())
                .mapToDouble(obj->obj)
                .average()
                .getAsDouble();


    }


    public static void main(String [] args){

       System.out.println(sortAllProductsByRating());
       System.out.println(getAvgOfAllProducts());

    }



}
