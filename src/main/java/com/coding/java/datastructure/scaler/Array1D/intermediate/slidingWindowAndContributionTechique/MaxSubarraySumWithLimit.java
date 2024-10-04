package com.coding.java.datastructure.scaler.Array1D.intermediate.slidingWindowAndContributionTechique;

/**
 * Problem Explanation:
 * You are given an integer array C of size A, and an integer B. The task is to find the maximum sum of a contiguous subarray such that the sum of the subarray does not exceed B.
 *
 * Approach:
 * We need to use a sliding window approach to find the maximum possible sum of a contiguous subarray that doesn't exceed B. The idea is to iterate through the array while keeping track of a window (subarray) and its sum. If the current window sum exceeds B, we reduce the window by sliding it forward (removing elements from the left) until the sum is valid again (i.e., ≤ B).
 *
 * Steps:
 * Initialize two pointers, left and right, to represent the sliding window. Start both at the beginning of the array.
 * Keep track of the sum of elements in the window.
 * For each element at right, add it to the window sum.
 * If the sum exceeds B, increment the left pointer to reduce the window size until the sum becomes less than or equal to B.
 * Track the maximum valid sum encountered during the iteration.
 * Example:
 * Let’s consider the array C = [1, 2, 3, 4, 5] and B = 7.
 *
 * The valid subarray sums should not exceed 7.
 * Possible subarrays:
 * [1, 2, 3] gives the sum 6, which is less than 7 and is the maximum valid sum.
 *
 *
 * Explanation:
 * ==============
 * 1.)Initialize variables: We initialize maxSum to store the result and currentSum to track the current sum of the sliding window.
 * 2.) Sliding window:
 *  => Iterate over the array using the right pointer.
 *  => For each element, add it to currentSum.
 *  => If currentSum exceeds B, we increment the left pointer and adjust currentSum by subtracting the element at left.
 * 3.) Check validity: After adjusting the window, if the currentSum is valid (i.e., ≤ B), we update the maxSum.
 * 4.) Return result: The function returns the maximum valid sum found during the traversal.
 *
 * Time Complexity:
 * ================
 * The time complexity is O(N), where N is the length of the array. This is because each element is added and removed from the window at most once.
 *
 * Space Complexity:
 * ================
 * The space complexity is O(1) as we are using only a few extra variables for the sliding window and the sum.
 */
public class MaxSubarraySumWithLimit {
    public static int maxSubarraySumWithLimit(int[] C, int B) {
        int maxSum = 0;  // To store the maximum sum found
        int currentSum = 0;  // To store the sum of the current window
        int left = 0;  // Left pointer for the sliding window
        
        // Iterate over each element with the right pointer
        for (int right = 0; right < C.length; right++) {
            currentSum += C[right];  // Add the current element to the window sum
            
            // If the current sum exceeds B, reduce the window size by moving the left pointer
            while (currentSum > B && left <= right) {
                currentSum -= C[left];  // Remove the leftmost element from the window
                left++;  // Slide the left pointer forward
            }
            
            // Update the maximum sum found if the current window sum is valid
            if (currentSum <= B) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] C = {1, 2, 3, 4, 5};
        int B = 7;
        int result = maxSubarraySumWithLimit(C, B);
        System.out.println(result);  // Output: 6
    }
}
