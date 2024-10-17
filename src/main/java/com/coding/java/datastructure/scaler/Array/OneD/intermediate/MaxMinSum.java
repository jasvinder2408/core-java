package com.coding.java.datastructure.scaler.Array.OneD.intermediate;

/**
 * Title: Max Min of an array
 *
 * Problem Description
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 *
 * Problem Constraints
 * 1 <= N <= 105
 * -109 <= A[i] <= 109
 */
public class MaxMinSum {

    // O(N)
    public static int findSumOfMaxAndMin(int[] A) {
        if (A == null || A.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }

        // Step 1: Initialize min and max with the first element of the array
        int min = A[0];
        int max = A[0];
        
        // Step 2: Traverse through the array to find the min and max elements
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        
        // Step 3: Return the sum of min and max
        return min + max;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int result = findSumOfMaxAndMin(A);
        System.out.println("Sum of Max and Min: " + result);  // Output: 10 (1 + 9)
    }
}
