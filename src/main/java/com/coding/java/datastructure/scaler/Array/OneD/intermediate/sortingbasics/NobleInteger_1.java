package com.coding.java.datastructure.scaler.Array.OneD.intermediate.sortingbasics;

import java.util.Arrays;

/**
 * Problem Description:
 * You are given an integer array A. You need to determine if there exists an integer p in the array such that the number of integers in the array greater than p is exactly equal to p. If such an integer p exists, return 1. Otherwise, return -1.
 *
 * Approach:
 * Sort the Array: Sorting allows us to efficiently compute the number of elements greater than a given value, as they will be positioned after that element in the sorted array.
 *
 * Iterate and Check:
 *
 * Once the array is sorted, for each element A[i], check if the number of elements greater than A[i] is equal to A[i].
 * The number of elements greater than A[i] is simply the total number of elements in the array minus the current index (N - i - 1).
 * Ensure you only check the first occurrence of an element if there are duplicates. This ensures you don't over-count.
 * Edge Case: If there are duplicates of p, check that only the first occurrence is considered.
 *
 * Steps:
 * Sort the array in non-decreasing order.
 * Loop through each element A[i] and check if A[i] == number of elements greater than A[i] (i.e., A[i] == N - i - 1).
 * If such an element is found, return 1. If no such element is found after checking all elements, return -1.
 *
 * Example 1:
 * Input: A = [3, 1, 4, 2, 5]
 *
 * Sort the array: [1, 2, 3, 4, 5]
 * For A[0] = 1: number of elements greater = 4, not equal to 1.
 * For A[1] = 2: number of elements greater = 3, not equal to 2.
 * For A[2] = 3: number of elements greater = 2, equal to 3. So return 1.
 * Output: 1
 *
 * Example 2:
 * Input: A = [0, 1, 2, 3]
 *
 * Sort the array: [0, 1, 2, 3]
 * For all elements, no p satisfies the condition.
 * Output: -1
 *
 * Time Complexity:
 * O(N log N) for sorting the array.
 * O(N) for checking the condition for each element.
 * Total time complexity: O(N log N).
 * Space Complexity:
 * O(1) extra space (sorting is done in place).
 * This solution efficiently finds if there exists an integer p such that the number of integers greater than p equals p.
 */
public class NobleInteger_1 {
    public static int findSpecialP(int[] A) {
        // Sort the array in ascending order
        Arrays.sort(A);
        int N = A.length;
        
        // Iterate through the array to check the condition
        for (int i = 0; i < N; i++) {
            // Number of elements greater than A[i]
            int countGreater = N - i - 1;
            
            // Check if A[i] is equal to the count of elements greater than A[i]
            if (A[i] == countGreater) {
                // Handle duplicates: make sure the next element is different
                if (i < N - 1 && A[i] == A[i + 1]) {
                    continue;
                }
                return 1;
            }
        }
        
        // No such integer found
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 4, 2, 5};
        int result = findSpecialP(A);
        System.out.println(result);  // Output: 1 or -1 depending on input
    }
}
