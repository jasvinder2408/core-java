package com.coding.java.datastructure.scaler.Array2D.refresher;

import java.util.Scanner;

public class MatrixSubtraction {
    // Function to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int m= A[0].length;

        int[][] C = new int[n][m];
        
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= m-1; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        
        return C;
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

        // Subtract matrices A and B
        int[][] C = subtractMatrices(A, B);

        // Output the resulting matrix C
        System.out.println("The resulting matrix after subtraction (A - B) is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
