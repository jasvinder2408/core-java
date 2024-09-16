package com.coding.java.datastructure.scaler.Array1D.intermediate;

/**
 * Title: Time to equality
 *
 * Problem Description
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 *
 *
 * Approach:
 *
 * Find the maximum element in the array: This is the target value that all elements should be increased to.
 * Calculate the number of operations: For each element in the array, calculate how many increments are needed to make it equal to the maximum value. This is done by subtracting the element's value from the maximum value.
 * Sum up the total operations: The sum of all these operations will give us the minimum time in seconds to make all elements equal.
 *
 */
public class MinTimeToEqualArray {

    // TC = O(N)
    // SC = O(1): We only use a few extra variables (maxElement and totalIncrements), so the space complexity is constant.
    public static int minTimeToEqualElements(int[] A) {
        // Step 1: Find the maximum element in the array
        int maxElement = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxElement) {
                maxElement = A[i];
            }
        }
        
        // Step 2: Calculate the total number of increments needed
        int totalIncrements = 0;
        for (int i = 0; i < A.length; i++) {
            totalIncrements += (maxElement - A[i]);
        }
        
        return totalIncrements;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int result = minTimeToEqualElements(A);
        System.out.println("Minimum time to make all elements equal: " + result);  // Output: 6
    }

    /**
     * The maximum element is 4. To make all elements equal to 4, we need to:
     *
     * Increment 1 to 4 (3 operations)
     * Increment 2 to 4 (2 operations)
     * Increment 3 to 4 (1 operation)
     * 4 is already the maximum, so no operations are needed.
     *
     * 3 + 2 + 1 = 6
     */
}
