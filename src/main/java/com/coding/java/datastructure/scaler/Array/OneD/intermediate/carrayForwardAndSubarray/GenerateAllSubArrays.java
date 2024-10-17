package com.coding.java.datastructure.scaler.Array.OneD.intermediate.carrayForwardAndSubarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an array A of N integers.
 * Return a 2D array consisting of all the subarrays of the array
 *
 * Note : The order of the subarrays in the resulting 2D array does not matter.
 *
 *
 * Problem Constraints
 * 1 <= N <= 100
 * 1 <= A[i] <= 105
 *
 * Approach:
 * Definition of Subarray:
 *
 * A subarray is a contiguous part of an array. For each starting index i, generate all subarrays starting from i and ending at any index j (i <= j < N).
 * Generate All Subarrays:
 *
 * Loop through each starting index i (from 0 to N-1).
 * For each i, loop through all possible ending indices j (from i to N-1).
 * For each pair of indices (i, j), generate the subarray from i to j and store it in the result.
 *
 * Time Complexity:
 *====================
 * Generating all subarrays requires iterating through all pairs (i, j), where i is the starting index and j is the ending index.
 * The total number of subarrays is approximately
 *
 * N(N+1)/2, so the time complexity is O(N^2).
 */
public class GenerateAllSubArrays {

    // Function to return a 2D array of all subarrays
    public static int[][] getAllSubarrays(int[] A) {
        int n = A.length;
        // Total number of subarrays is N * (N + 1) / 2
        int totalSubarrays = (n * (n + 1)) / 2;
        
        // This will hold all subarrays
        //int[][] result = new int[totalSubarrays][];
        List<int[]> result = new ArrayList<>();

        int index = 0;
        
        // Iterate over all possible starting points of subarrays
        for (int i = 0; i < n; i++) {
            // For each starting point, iterate over all possible ending points
            for (int j = i; j < n; j++) {
                // Create a subarray from A[i] to A[j]
                int[] subarray = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    subarray[k - i] = A[k];
                }
                // Store this subarray in the result arrayList
              //  result[index++] = subarray;
                result.add(subarray);
            }
        }
        
        //return result;
        return result.toArray(new int[result.size()][]);

    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};  // Example input

        // Call the function to get all subarrays
        int[][] allSubarrays = getAllSubarrays(A);

        // Print the result 2D array
        for (int[] subarray : allSubarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}
