package com.coding.java.datastructure.scaler.Array1D.intermediate;

/**
 *
 * Title: Second Largest
 *
 * Problem Description
 * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * 0 <= A[i] <= 109
 *
 * Steps:
 *
 * Traverse the array to find the largest element.
 * Traverse the array again to find the second largest element that is smaller than the maximum.
 * If no second largest element is found (e.g., all elements are the same), return a message saying no such element exists.
 */
public class SecondLargestElement {

    /**
     * Time Complexity:
     * O(N) where N is the size of the array. We traverse the array twice: once to find the maximum and once to find the second largest element.
     * Space Complexity:
     * O(1): We only use a few variables (max and secondMax), so no additional space proportional to the input size is required.
     */
    public static int findSecondLargest(int[] A) {
        if (A.length < 2) {
            // If the array has fewer than 2 elements, there's no second largest element
            System.out.println("No second largest element exists");
            return -1;
        }
        
        // Step 1: Find the largest element
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        
        // Step 2: Find the second largest element
        Integer secondMax = null;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != max) { // We are only interested in elements less than max
                if (secondMax == null || A[i] > secondMax) {
                    secondMax = A[i];
                }
            }
        }
        
        // Step 3: If secondMax is still null, no second largest element exists
        if (secondMax == null) {
            System.out.println("No second largest element exists");
            return -1;
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 7, 5, 7};
        int result = findSecondLargest(A);
        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        }
    }
}
