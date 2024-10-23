package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.Scanner;

/**
 *Problem Description
 * You are given T(number of test cases) integer arrays.
 * For each array A, you have to find the value of absolute difference between
 * the counts of even and odd elements in the array.
 *
 *
 * For each test case, initialize two counters: one for even numbers and one for odd numbers.
 */
public class EvenOddDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {

            int n = scanner.nextInt(); // Read the size of the array
            int[] arr = new int[n];

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Calculate the absolute difference between counts of even and odd elements
            int result = countEvenOddDifference(arr);
            System.out.println(result);
        }

        scanner.close();
    }

    public static int countEvenOddDifference(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return Math.abs(evenCount - oddCount);
    }
}
