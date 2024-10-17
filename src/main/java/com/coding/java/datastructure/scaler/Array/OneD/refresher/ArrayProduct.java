package com.coding.java.datastructure.scaler.Array.OneD.refresher;

/**
 * Title: Product of elements in an array
 *
 * Problem Description:
 *
 * Write a program that returns the product of all elements present in the array.
 */
public class ArrayProduct {
    // Function to return the product of all elements in the array
    public static int productOfArray(int[] arr) {
        int product = 1;  // Initialize product to 1
        
        // Loop through the array and calculate the product
        for (int num : arr) {
            product *= num;
        }
        
        return product;  // Return the final product
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 3, 4, 5};  // Example array passed as argument
        
        // Calculate and print the product of the array
        int result = productOfArray(arr);
        System.out.println("Product of array elements: " + result);
    }
}
