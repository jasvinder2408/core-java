package com.coding.java.datastructure.scaler.Array2D.refresher;

import java.util.Scanner;

public class MatrixColumnByColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows (N) and columns (M)
        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int M = scanner.nextInt();

        // Input the matrix elements row by row
        int[][] matrix = new int[N][M];
        System.out.println("Enter the matrix elements row by row:");
        for (int i = 0; i <=N-1; i++) {
            for (int j = 0; j <=M-1; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix column by column
        System.out.println("Matrix printed column by column:");
        for (int col = 0; col < M; col++) {
            for (int row = 0; row < N; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();  // Move to next line after each column
        }

        scanner.close();
    }
}
