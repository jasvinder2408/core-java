package com.coding.java.datastructure.scaler.Array.OneD.intermediate.slidingWindowAndContributionTechique;

/**
 * Problem Description
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 *
 * Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Ai <= 10 4
 *
 * Approach:
 * To solve this problem efficiently, we can avoid calculating the sum of each subarray individually,
 *  which would take O(N^3) time in the brute-force approach.
 *
 * Instead, we use the observation that:
 *
 * An element A[i] in the array will appear in multiple subarrays. Specifically, A[i] will appear in subarrays that start anywhere between index 0 and i, and end anywhere between i and N-1.
 * The number of subarrays in which A[i] appears is (i + 1) * (N - i). This is because:
 * There are (i + 1) choices for the starting index of the subarray (it can start at any index from 0 to i).
 * There are (N - i) choices for the ending index of the subarray (it can end at any index from i to N-1).
 * Thus, the total contribution of A[i] to the sum of all subarray sums is A[i] * (i + 1) * (N - i).
 *
 * Algorithm:
 * Initialize a variable totalSum to store the total sum of all subarrays.
 * Loop through the array and calculate the contribution of each element to the total sum of subarray sums using the formula A[i] * (i + 1) * (N - i).
 * Accumulate the result into totalSum.
 * Return the totalSum.
 * Time Complexity:
 * The time complexity of this approach is O(N), where N is the length of the array, because we loop through the array once.
 */
public class SumOfAllSubArrays {

    // Function to calculate the sum of all subarray sums
    public static long sumOfAllSubarraySums(int[] A) {
        int N = A.length;
        long totalSum = 0;  // Use long to handle large sums
        
        // Loop through each element of the array
        for (int i = 0; i < N; i++) {
            // Calculate the contribution of A[i] to the total sum
            long contribution = (long)(i + 1) * (N - i); // Number of subarrays A[i] is part of
            totalSum += (long) A[i] * contribution;
        }

        return totalSum;  // Return the total sum of all subarray sums
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};  // Example array
        System.out.println(sumOfAllSubarraySums(A));  // Output: 20
    }
}
