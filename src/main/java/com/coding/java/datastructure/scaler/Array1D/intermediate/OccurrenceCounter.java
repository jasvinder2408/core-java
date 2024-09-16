package com.coding.java.datastructure.scaler.Array1D.intermediate;

/**
 * Title: Linear Search - Multiple Occurence
 * Problem Description
 * Given an array A and an integer B, find the number of occurrences of B in A.
 *
 *
 * Problem Constraints
 * 1 <= B, Ai <= 109
 * 1 <= length(A) <= 105
 */
public class OccurrenceCounter {
    public static int countOccurrences(int[] A, int B) {
        int count = 0;
        
        // Step 2: Traverse the array
        for (int i = 0; i < A.length; i++) {
            // Step 3: Check if the current element equals B
            if (A[i] == B) {
                count++;  // Increment the counter
            }
        }
        
        // Step 4: Return the count
        return count;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 2, 5, 2};
        int B = 2;
        int result = countOccurrences(A, B);
        System.out.println("Number of occurrences of " + B + ": " + result);  // Output: 3
    }
}
