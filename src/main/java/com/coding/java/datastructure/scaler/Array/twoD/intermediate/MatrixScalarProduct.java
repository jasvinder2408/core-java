package com.coding.java.datastructure.scaler.Array.twoD.intermediate;

/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

  To perform scalar multiplication of a matrix A with an integer B, we multiply each element of the matrix by B.
 */
public class MatrixScalarProduct {
    public static int[][] scalarMultiplication(int[][] A, int B) {
        int rows = A.length;
        int cols = A[0].length;
        
        // Initialize a new matrix to store the result
        int[][] result = new int[rows][cols];
        
        // Perform scalar multiplication
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] * B;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int B = 3;
        
        int[][] result = scalarMultiplication(matrix, B);
        
        // Print the result matrix
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
