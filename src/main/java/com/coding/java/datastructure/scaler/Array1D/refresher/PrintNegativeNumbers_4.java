package com.coding.java.datastructure.scaler.Array1D.refresher;

import java.util.Scanner;

public class PrintNegativeNumbers_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[N];
        
        // Read the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Close the scanner
        scanner.close();
        
        // Print negative numbers
        System.out.println("Negative numbers in the array are:");
        boolean foundNegative = false;
        for (int num : array) {
            if (num < 0) {
                System.out.print(num + " ");
                foundNegative = true;
            }
        }
        
        if (!foundNegative) {
            System.out.println("No negative numbers in the array.");
        }
    }
}
