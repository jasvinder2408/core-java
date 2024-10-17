package com.coding.java.datastructure.scaler.Array.twoD.refresher;

import java.util.Scanner;

/**
 * Title: Largest in each Row of 2D Array
 *
 * Problem Description
 *
 * Given a 2D array A of N rows and M columns. Find value of largest element in each row.
 */
public class LargestInRows {
    // Function to find the largest element in each row
    public static int[] largestInRows(int[][] A, int N, int M) {
        int[] result = new int[N];  // Array to store largest elements in each row

        // Iterate over each row
        for (int i = 0; i < N; i++) {
            int max = A[i][0];  // Initialize max with the first element in the row
            // Iterate over each column in the current row
            for (int j = 1; j < M; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];  // Update max if current element is larger
                }
            }
            result[i] = max;  // Store the maximum value of the current row
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

        // Get the largest element in each row
        int[] largestElements = largestInRows(A, N, M);

        // Output the largest elements
        System.out.println("Largest elements in each row:");
        for (int max : largestElements) {
            System.out.print(max + " ");
        }
        System.out.println();

        scanner.close();
    }
}
