package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.Scanner;

public class MinAndMaxInArrayDemo_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
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

        // Find the maximum and minimum values
        int max = findMax(array);
        int min = findMin(array);

        // Print the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] arr) {

        int max = arr[0];
        int size = arr.length;

        for (int i=0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    }

