package com.coding.java.datastructure.scaler.Array.OneD.intermediate.prefixSum;

import java.util.Arrays;

/*
  Title:  Range Sum Query
  ========================

  Problem Description:
  ====================
  You are given an integer array A of length N.
  You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
  For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
  More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

  Problem Constraints
  1 <= N, M <= 105
  1 <= A[i] <= 109
  0 <= L <= R < N

  Approach:
  ==========
  Prefix Sum Array:
  Create an array prefixSum[] where prefixSum[i] stores the sum of elements from the start of the array A up to index i.
  That is, prefixSum[i] = A[0] + A[1] + ... + A[i].
  Using this prefixSum[] array, the sum for any query [L, R] can be calculated as:

  sum(L,R)=prefixSum[R]−prefixSum[L−1]

  If L = 0, the sum is simply prefixSum[R].

  Steps:
  Build the prefix sum array.
  For each query, use the prefix sum to compute the result in constant time.

  ===========================================================
  Explanation:

  Prefix Sum Array:

  We compute prefixSum[] such that each element prefixSum[i] stores the sum of elements from A[0] to A[i].

  Example for array A = {1, 2, 3, 4, 5}:

  prefixSum[0] = 1
  prefixSum[1] = 1 + 2 = 3
  prefixSum[2] = 1 + 2 + 3 = 6
  prefixSum[3] = 1 + 2 + 3 + 4 = 10
  prefixSum[4] = 1 + 2 + 3 + 4 + 5 = 15

  So, prefixSum[] = {1, 3, 6, 10, 15}.

  Answering Queries:
  ==================
  For each query [L, R], we calculate the sum of elements from A[L] to A[R] using the prefix sum:
  If L == 0, the sum is simply prefixSum[R].

  Otherwise, the sum is prefixSum[R] - prefixSum[L-1].
  Examples:
  Query [0, 2]: prefixSum[2] = 6 → Result is 6.
  Query [1, 3]: prefixSum[3] - prefixSum[0] = 10 - 1 = 9 → Result is 9.
  Query [2, 4]: prefixSum[4] - prefixSum[1] = 15 - 3 = 12 → Result is 12.

  Time Complexity:
  ==================
  Building the prefix sum: O(N), where N is the length of the array A.
  Answering queries: Each query takes O(1) time, so for M queries, the time complexity is O(M).

  Space Complexity:
  =====================
  O(N) for storing the prefixSum[] array.
 */
public class RangeSumQueries {
    public static long[] rangeSum(int[] A, int[][] B) {

        int N = A.length;
        int M = B.length;

        // Step 1: Build the prefix sum array
        long[] prefixSum = new long[N];
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }

        // Step 2: For each query in B, calculate the sum using the prefix sum array
        long[] result = new long[M];
        for (int i = 0; i < M; i++) {
            int L = B[i][0];
            int R = B[i][1];

            // Check for invalid negative indices
            if (L < 0 || R < 0 || L >= N || R >= N || L > R) {
                result[i] = -1;  // Return -1 or any other error code for invalid indices
            }
            else{

                if (L == 0) {
                    result[i] = prefixSum[R];
                } else {
                    result[i] = prefixSum[R] - prefixSum[L - 1];
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {
            {0, 2},  // Query 1: sum of elements from index 0 to 2
            {1, 3},  // Query 2: sum of elements from index 1 to 3
            {2, 4}   // Query 3: sum of elements from index 2 to 4
        };

//        int[][] B = {
//                {0, 2},  // Query 1: sum of elements from index 0 to 2
//                {-1, 3}, // Query 2: Invalid negative index, should return error code (-1)
//                {2, 1},  // Query 3: Invalid L > R, should return error code (-1)
//                {1, 4}   // Query 4: sum of elements from index 1 to 4
//        };
        //        System.out.println(Arrays.toString(result));  // Output: [6, -1, -1, 14]
        
        // Get the results for the queries
        long[] result = rangeSum(A, B);
        
        // Print the results
        System.out.println(Arrays.toString(result));  // Output: [6, 9, 12]
    }
}
