package com.coding.java.datastructure.scaler.Array1D.refresher;

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
public class EvenOddDifference_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Loop over each test case
        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int n = sc.nextInt();

            // Initialize counters for even and odd numbers
            int evenCount = 0;
            int oddCount = 0;

            // Read the array elements and count evens and odds
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Calculate the absolute difference between even and odd counts
            int difference = Math.abs(evenCount - oddCount);

            // Output the result for this test case
            System.out.println(difference);
        }

        sc.close();
    }
}
