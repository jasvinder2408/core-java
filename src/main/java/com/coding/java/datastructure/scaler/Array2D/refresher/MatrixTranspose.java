package com.coding.java.datastructure.scaler.Array2D.refresher;

/**
 * Title: Matrix Transpose.
 *
 * Given a 2D integer array A, return the transpose of A.
 *
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 */
public class MatrixTranspose {
    // Function to return the transpose of a matrix A
    public static int[][] transpose(int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return new int[0][0]; // Return empty matrix if input is empty
        }

        int m = A.length;          // Number of rows in A
        int n = A[0].length;       // Number of columns in A
        int[][] B = new int[n][m]; // Initialize the transpose matrix B

        // Fill the transpose matrix B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[j][i] = A[i][j]; // Transpose element
            }
        }

        return B; // Return the transposed matrix
    }

    public static void main(String[] args) {
        // Example matrix A
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Get the transpose of matrix A
        int[][] B = transpose(A);

        // Print the transposed matrix B
        System.out.println("Transpose of the matrix:");
        for (int[] row : B) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
