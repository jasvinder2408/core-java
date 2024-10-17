package com.coding.java.datastructure.scaler.Array.twoD.refresher;

/**
 * Title: Main Diagonal Sum
 *
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 *
 * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 *
 *
 * Steps:
 1) Identify the main diagonal elements: In a square matrix, the main diagonal consists of elements where the
    row index equals the column index (i.e., A[i][i] for 𝑖 = 0 to N-1

  2) Sum the diagonal elements: Traverse the matrix from i=0 to N-1 and sum the elements A[i][i].
 *

  Algorithm:
 ===========
 1) Loop through the matrix from 0 to N-1.

 2) At each step, add the element at position A[i][i] to the sum.

 Time Complexity:
 ================
 => Since we are only iterating through the diagonal elements, the time complexity is O(N), where N is the size of the matrix.
 */
public class DiagonalSum {
    // Function to return the sum of the main diagonal elements of a matrix A
    public static int sumOfMainDiagonal(int[][] A) {

        int n = A.length; // Number of rows (or columns, since it's NxN matrix)

        int sum = 0; // Initialize sum to 0
        
        // Iterate through the matrix to sum the main diagonal elements
        for (int i = 0; i <= n-1; i++) {
            sum = sum + A[i][i]; // Add the diagonal element
        }
        
        return sum; // Return the total sum of the main diagonal elements
    }

    public static void main(String[] args) {
        // Example matrix A
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Get the sum of the main diagonal elements
        int result = sumOfMainDiagonal(A);
        
        // Print the result
        System.out.println("Sum of the main diagonal elements: " + result);
    }
}
