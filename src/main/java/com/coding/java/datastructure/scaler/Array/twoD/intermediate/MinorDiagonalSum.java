package com.coding.java.datastructure.scaler.Array.twoD.intermediate;
/*

Problem Description
====================

You are given an N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

Problem Constraints
===================
1 <= N <= 103

-1000 <= A[i][j] <= 1000


To find the sum of the minor diagonal elements in an N×N matrix, we need to identify all elements where the sum of the row index i and column index j equals N + 1 in a 1-based index system. In 0-based index (as used in most programming languages like Java), this means that i + j = N - 1.

Approach:
We loop through the matrix and for each row, we pick the element at the index where the sum of the row index i and column index j equals N - 1.

Explanation:
===========
1) Matrix Initialization: We define the matrix A as an N×N matrix.

2) Minor Diagonal Identification: The condition i + j = N - 1 for minor diagonal in 0-based index becomes A[i][N-1-i].
3) Sum Calculation: For each row i, we add the corresponding minor diagonal element A[i][N-1-i].
4) Return the Sum: The sum of the minor diagonal elements is returned and printed.

Example:
=========
If matrix A is:

1  2  3
4  5  6
7  8  9
The minor diagonal elements are:

3, 5, 7
Thus, the sum of the minor diagonal is:

3 + 5 + 7 = 15

Time Complexity:
================
O(N) where N is the number of rows (or columns) in the matrix, as we only traverse the diagonal elements.

Space Complexity:
================
O(1) since we only use a single variable to store the sum.
 */
public class MinorDiagonalSum {
    public static int sumMinorDiagonal(int[][] A) {
        int N = A.length; // Get the size of the matrix (N x N)
        int sum = 0;
        
        // Traverse through the matrix and sum minor diagonal elements
        for (int i = 0; i < N; i++) {
            sum += A[i][N - 1 - i]; // Minor diagonal condition i + j = N - 1
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int result = sumMinorDiagonal(A);
        System.out.println("Sum of minor diagonal elements: " + result);
    }
}
