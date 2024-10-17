package com.coding.java.datastructure.scaler.Array.twoD.refresher;

/**
 Problem Description
 Given a 2D integer array A, return the transpose of A.

 The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 Steps:
 ======
 1) Transpose Definition: The transpose of a matrix is obtained by flipping it over its main diagonal. In other words, the element at position
    A[i][j] in the original matrix becomes A[j][i] in the transposed matrix.

 2) Matrix Dimensions:

     A) If the original matrix has dimensions N×M (i.e.,  N rows and M columns), then the transposed matrix will have dimensions M×N.
 3) Fill the Transposed Matrix: Loop through the original matrix and place each element at its transposed position in the new matrix.

 Time Complexity:
 ===============
 The time complexity for this operation is O(N * M) where N is the number of rows and M is the number of columns in the original matrix.
*/
 public class MatrixTranspose {
    // Function to return the transpose of a matrix A
    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        // Create a new matrix with dimensions cols x rows
        int[][] transposed = new int[cols][rows];

        // Fill the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = A[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] result = transpose(matrix);

        // Print the transposed matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
        // Output:
        // 1 4 7
        // 2 5 8
        // 3 6 9
    }
}
