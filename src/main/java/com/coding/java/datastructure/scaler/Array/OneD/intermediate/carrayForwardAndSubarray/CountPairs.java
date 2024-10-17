package com.coding.java.datastructure.scaler.Array.OneD.intermediate.carrayForwardAndSubarray;

/**
 * Title: Special Subsequences "AG" - 2
 *
 * Problem Description
 * You have given a string A having Uppercase English letters.
 *
 * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 *
 * Approach:
 * Key Insight:
 * For each occurrence of 'A' at index i, count how many 'G's appear after it (for all indices j > i).
 * Efficient Solution:
 * Traverse the string from left to right.
 * Keep track of the number of 'A's encountered so far.
 * When encountering a 'G', add the number of 'A's found so far to the result because each 'A' forms a valid pair with the current 'G'.
 * Steps:
 * Initialize two variables:
 * countA to keep track of how many 'A's have been encountered so far.
 * totalPairs to count the total number of valid (i, j) pairs.
 * Loop through the string:
 * If the current character is 'A', increment countA.
 * If the current character is 'G', add countA to totalPairs because all previously encountered 'A's can form a valid pair with this 'G'.
 *
 *
 * Explanation:
 * For the input string A = "AAGAGG":
 *
 * We encounter two 'A's at the beginning.
 * When we encounter a 'G', we add the count of 'A's (which is 2), forming two valid pairs: ("A", "G").
 * Continuing through the string, we encounter more 'G's and accumulate more pairs.
 * Example:
 * For A = "AAGAGG", the valid pairs are:
 *
 * Pair (0, 2) -> A[0] = 'A', A[2] = 'G'
 * Pair (1, 2) -> A[1] = 'A', A[2] = 'G'
 * Pair (0, 4) -> A[0] = 'A', A[4] = 'G'
 * Pair (1, 4) -> A[1] = 'A', A[4] = 'G'
 * Pair (3, 5) -> A[3] = 'A', A[5] = 'G'
 * So, the total number of valid pairs is 5.
 *
 * Time Complexity:
 * O(N): We only loop through the string once, making the solution linear in terms of time complexity, where N is the length of the string.
 */
public class CountPairs {

    // Function to count the number of valid pairs (i, j) such that A[i] = 'A' and A[j] = 'G'
    public static int countPairs(String A) {
        int countA = 0;        // To keep track of how many 'A's we have encountered
        int totalPairs = 0;    // To keep track of the total number of valid pairs

        // Loop through the string
        for (int i = 0; i < A.length(); i++) {
            // If we encounter an 'A', increase the count of 'A's
            if (A.charAt(i) == 'A') {
                countA++;
            }
            // If we encounter a 'G', add the number of 'A's encountered so far to the result
            else if (A.charAt(i) == 'G') {
                totalPairs += countA;
            }
        }

        return totalPairs;  // Return the total number of valid pairs
    }

    public static void main(String[] args) {
        String A = "AAGAGG";  // Example input

        // Call the function and print the result
        int result = countPairs(A);
        System.out.println("Total number of pairs: " + result);  // Output: 5
    }
}
