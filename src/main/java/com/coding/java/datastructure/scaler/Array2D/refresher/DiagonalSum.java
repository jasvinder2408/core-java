package com.coding.java.datastructure.scaler.Array2D.refresher;

/**
 * Title: Main Diagonal Sum
 *
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 *
 * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
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
