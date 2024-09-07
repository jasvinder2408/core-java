package com.coding.java.datastructure.Array.scaler.refresher.Array2D;

import java.util.Scanner;

public class WavePrintMatrixColWise {
    // Function to print the matrix in wave form
    public static void wavePrint(int[][] mat) {

        int n = mat.length;

        for (int col = 0; col <= n-1; col++) {

            if (col % 2 == 0) {
                // Print top to bottom for even-indexed columns
                for (int row = 0; row <= n-1; row++) {
                    System.out.print(mat[row][col] + " ");
                }
            } else {
                // Print bottom to top for odd-indexed columns
                for (int row = n - 1; row >= 0; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
        }
        System.out.println();  // Ensure the output ends with a new line
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        System.out.print("Enter the size of the matrix (N): ");
        int N = scanner.nextInt();

        // Input matrix elements
        int[][] Mat = new int[N][N];
        System.out.println("Enter the matrix elements row-wise:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix in wave form
        wavePrint( Mat);

        scanner.close();
    }
}
