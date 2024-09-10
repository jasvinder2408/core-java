package com.coding.java.datastructure.Array.scaler.refresher.Array2D;

import java.util.Scanner;

public class MatrixAddition {

    // Function to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] C = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
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

        // Add matrices A and B
        int[][] C = addMatrices(A, B, rows, cols);

        // Output the resulting matrix C
        System.out.println("The resulting matrix after addition is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
