package com.coding.java.datastructure.Array.scaler.refresher.ArrayList;

import java.util.Scanner;

/**
 * Title: Row & Column Sums.
 *
 * Problem Description
 * You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.
 *
 * NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.
 */
public class RowAndColumnSums {
    // Function to calculate the sum of rows and columns
    public static int[] sumRowsAndColumns(int[][] A, int N, int M) {
        int[] result = new int[N + M];  // Array to store sum of rows followed by sum of columns

        // Calculate sum of each row
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < M; j++) {
                rowSum += A[i][j];
            }
            result[i] = rowSum;  // Store row sum in the result array
        }

        // Calculate sum of each column
        for (int j = 0; j < M; j++) {
            int colSum = 0;
            for (int i = 0; i < N; i++) {
                colSum += A[i][j];
            }
            result[N + j] = colSum;  // Store column sum in the result array
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows (N) and columns (M)
        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int M = scanner.nextInt();

        // Input the 2D array A
        int[][] A = new int[N][M];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Get the sum of rows and columns
        int[] result = sumRowsAndColumns(A, N, M);

        // Output the result
        System.out.println("Sum of rows followed by sum of columns:");
        for (int sum : result) {
            System.out.print(sum + " ");
        }
        System.out.println();

        scanner.close();
    }
}
