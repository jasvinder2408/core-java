package com.coding.java.datastructure.scaler.Array.OneD.intermediate.carrayForwardAndSubarray;

/**
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 *
 * and at least one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2000
 *
 *
 * Approach:
 * Identify Maximum and Minimum:
 * Find the maximum and minimum values in the array.
 * Track the Closest Indices:
 * Traverse the array while keeping track of the last seen index of the maximum and minimum values.
 * Whenever both the maximum and minimum values are found in a valid subarray, calculate the size of the subarray (difference between indices) and keep track of the smallest such size.
 * Steps:
 * Find the maximum and minimum values in the array.
 * Traverse the array:
 * For each element, check if it is equal to the maximum or minimum.
 * If it is, check the distance to the closest opposite value (maximum for minimum or minimum for maximum).
 * Track the smallest subarray size that includes both the maximum and minimum.
 *
 * Time Complexity:
 * O(N) where N is the size of the array. We traverse the array a couple of times (once to find max/min and once to calculate subarray sizes).
 *
 */
public class ClosestMinMax {

    /**
     * O(N) where N is the size of the array.
     * We go through the array once to find the max/min and once to calculate subarray sizes.     *
     */
    // Function to find the size of the smallest subarray containing both max and min
    public static int smallestSubarraySize(int[] A) {
        int n = A.length;
        
        // Step 1: Find the maximum and minimum values in the array
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (A[i] > maxVal) {
                maxVal = A[i];
            }
            if (A[i] < minVal) {
                minVal = A[i];
            }
        }
        
        // If max and min are the same, the smallest subarray is of size 1
        if (maxVal == minVal) {
            return 1;
        }

        // Step 2: Traverse the array to find the smallest subarray size
        int minIndex = -1, maxIndex = -1;
        int smallestSize = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (A[i] == maxVal) {
                maxIndex = i;
                // If we've seen a minimum value before, calculate subarray size
                if (minIndex != -1) {
                    smallestSize = Math.min(smallestSize, maxIndex - minIndex + 1);
                }
            }
            if (A[i] == minVal) {
                minIndex = i;
                // If we've seen a maximum value before, calculate subarray size
                if (maxIndex != -1) {
                    smallestSize = Math.min(smallestSize, minIndex - maxIndex + 1);
                }
            }
        }

        return smallestSize;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 3, 2, 5, 1, 3};  // Example input

        // Call the function to find the size of the smallest subarray
        int result = smallestSubarraySize(A);

        // Print the result
        System.out.println(result);  // Output: 2
    }
}
