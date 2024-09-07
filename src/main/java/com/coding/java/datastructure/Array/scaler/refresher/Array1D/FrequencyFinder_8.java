package com.coding.java.datastructure.Array.scaler.refresher.Array1D;

import java.util.Scanner;

public class FrequencyFinder_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[N];
        
        // Read the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Read the integer B whose frequency needs to be found
        System.out.print("Enter the integer B: ");
        int B = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Find and print the frequency of B in the array
        int frequency = findFrequency(arr, B);
        System.out.println("Frequency of " + B + " in the array is: " + frequency);
    }

    // Method to find the frequency of integer B in the array
    public static int findFrequency(int[] arr, int B) {
        int count = 0;
        for (int i=0; i < arr.length; i++) {

            if (arr[i] == B) {
                count++;
            }
        }
        return count;
    }
}
