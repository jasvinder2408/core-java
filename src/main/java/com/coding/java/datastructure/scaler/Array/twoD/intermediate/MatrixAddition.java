package com.coding.java.datastructure.scaler.Array.twoD.intermediate;
/*

Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

Problem Constraints

1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000

Approach:

Matrix addition is straightforward: we add corresponding elements of two matrices. Given two matrices A and B of the same size, their sum is a matrix C such that each element C[i][j] = A[i][j] + B[i][j].

Time Complexity:
O(N * M) where N is the number of rows and M is the number of columns in the matrices, since each element is accessed once for addition.
Space Complexity:
O(N * M) for storing the result matrix, which is the same size as the input matrices.

 */
public class MatrixAddition {
    public static int[][] matrixAddition(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        
        // Initialize the result matrix
        int[][] result = new int[rows][cols];
        
        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] result = matrixAddition(A, B);
        
        // Print the result matrix
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
