package com.coding.java.datastructure.scaler.Array.OneD.intermediate.carrayForwardAndSubarray;

import java.util.Arrays;

/**
 * Problem Description
 * Given an array A of length N, return the subarray from B to C.
 */
public class SubArrayInGivenRange {

    /**
     * Time Complexity:
     * O(C - B + 1): The time complexity depends on the length of the subarray, which is (C - B + 1).
     */
    // Function to return the subarray from index B to C
    public static int[] getSubarray(int[] A, int B, int C) {

        int subarrayLength = C - B + 1;
        int[] subarray = new int[subarrayLength];

        for (int i = 0; i < subarrayLength; i++) {
            subarray[i] = A[B + i];
        }

        return subarray;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};  // Example input
        int B = 1, C = 3;           // Subarray from index 1 to 3

        // Call the function to get the subarray
        int[] result = getSubarray(A, B, C);

        // Print the result
        System.out.println(Arrays.toString(result));  // Output: [2, 3, 4]
    }
}
