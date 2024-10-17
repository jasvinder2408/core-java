package com.coding.java.datastructure.scaler.Array.OneD.intermediate;

/**
 * Title: Count of elements
 *
 *Problem Description
 * ===================
 * Given an array A of N integers.
 * Count the number of elements that have at least 1 elements greater than itself.
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 *
 * Key Observations:
 * =================
 *
 * The only elements that do not have any greater elements are the ones that are equal to the maximum element in the array.
 * Therefore, the count of elements that have at least one greater element is simply the total number of elements in the array minus the number of elements that are equal to the maximum value.
 *
 * Approach:
 * =========
 * Find the maximum element in the array.
 * Count how many elements in the array are equal to this maximum element.
 * Subtract the count of elements equal to the maximum from the total number of elements to get the number of elements that have at least one
 * greater element.
 */
public class CountElementsWithGreater {

    /**
     *
     * Time Complexity:
     * O(N) where N is the size of the array. We traverse the array twice: once to find the maximum element and once to count how many elements are equal to it.
     * Space Complexity:
     * O(1): The algorithm uses a constant amount of extra space for a few variables (maxElement and countMax).
     */
    public static int countElementsWithGreater(int[] A) {
        int N = A.length;
        
        // Step 1: Find the maximum element in the array
        int maxElement = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] > maxElement) {
                maxElement = A[i];
            }
        }
        
        // Step 2: Count how many elements are equal to the maximum element
        int countMax = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == maxElement) {
                countMax++;
            }
        }
        
        // Step 3: Return the number of elements with at least one greater element
        return N - countMax;
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 3, 4};
        int result = countElementsWithGreater(A);
        System.out.println("Number of elements with at least one greater element: " + result);  // Output: 4
    }
}
