package com.coding.java.datastructure.scaler.Array2D.refresher;

import java.util.Scanner;

public class MatrixEqualityCheck {
    // Function to check if two matrices are equal
    public static boolean areMatricesEqual(int[][] A, int[][] B) {

        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= m-1; j++) {

                if (A[i][j] != B[i][j]) {
                    return false;  // If any element doesn't match, matrices are not equal
                }
            }
        }
        return true;  // All elements match, matrices are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Input matrix A
        int[][] A = new int[rows][cols];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Input matrix B
        int[][] B = new int[rows][cols];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrices are equal
        if (areMatricesEqual(A, B)) {
            System.out.println("Matrices are equal.");
        } else {
            System.out.println("Matrices are not equal.");
        }

        scanner.close();
    }
}
