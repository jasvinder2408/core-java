package com.coding.java.datastructure.scaler.Array.OneD.intermediate.slidingWindowAndContributionTechique;

/**
 * Problem Description
 * Given an array A of length N. Also given are integers K and C.
 *
 * Return 1 if there exists a subarray with length K having sum C and 0 otherwise
 *
 * Approach:
 * We can solve this problem efficiently using the sliding window technique. The idea is to maintain a window of size K and keep track of the sum of the elements within the window.
 * By sliding the window across the array, we can compute the sum of each subarray of size K and check if it equals C.
 *
 * Steps:
 * Start by calculating the sum of the first K elements (i.e., the first subarray of size K).
 * Slide the window by one element at a time, updating the sum by adding the new element and subtracting the first element of the previous window.
 * If any subarray has a sum equal to C, return 1.
 * If no such subarray is found, return 0.
 *
 * Time Complexity:
 * The time complexity is O(N), where N is the length of the array A. This is because each element is processed once when it enters or exits the sliding window.
 */
public class SubArrayWithGivenSumAndLength {

    // Function to check if there's a subarray of length K with sum C
    public static int isSubarrayWithSum(int[] A, int N, int K, int C) {
        // If the array is smaller than the subarray length, return 0
        if (K > N) return 0;

        int sum = 0;

        // Step 1: Calculate the sum of the first subarray of size K
        for (int i = 0; i < K; i++) {
            sum += A[i];
        }

        // Step 2: Check if the first subarray's sum is equal to C
        if (sum == C) return 1;

        // Step 3: Slide the window over the array

        int s=1;
        int e =K;
//        for (int i = K; i < N; i++) {
          while ( e < N) {
           // sum = sum + A[i];
            sum = sum - A[s - 1] + A[e];      // Remove the first element of the previous window and Add the next element in the window

            // Check if the current window sum equals C
            if (sum == C) return 1;

            s++;
            e++;
        }

        // If no valid subarray was found, return 0
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1};  // Example array
        int K = 3;                   // Length of the subarray
        int C = 8;                   // Desired sum

        int result = isSubarrayWithSum(A, A.length, K, C);
        System.out.println(result);  // Output: 1 (as subarray [2, 3] has sum 5)
    }
}
