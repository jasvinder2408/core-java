package com.coding.java.datastructure.Array.scaler.refresher.Array1D;

import java.util.Scanner;

public class SearchElementInArray_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 1; t <= T; t++) {
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
            
            // Read the integer B
            System.out.print("Enter the integer B: ");
            int B = scanner.nextInt();
            
            // Check if B is present in the array
            if (contains(array, B)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        // Close the scanner
        scanner.close();
    }

    // Method to check if the array contains the integer B
    public static boolean contains(int[] array, int B) {

        for (int num : array) {
            if (num == B) {
                return true;
            }
        }
        return false;
    }
}
