package com.coding.java.datastructure.scaler.Array1D.refresher;

import java.util.Scanner;

public class ArrayDeletion_3 {

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
        
        // Read the position X (1-based index)
        System.out.print("Enter the position of the element to delete (1-based index): ");
        int X = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Validate position X
        if (X < 1 || X > N) {
            System.out.println("Invalid position");
            return;
        }
        
        // Create a new array with one less element
        int[] newArray = new int[N - 1];
        
        // Copy elements except the one at position X
        for (int i = 0, j = 0; i < N; i++) {
            if (i != (X - 1)) { // (X - 1) because array is 0-based index
                newArray[j++] = array[i];
            }
        }
        
        // Print the updated array
        System.out.println("Array after deletion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
