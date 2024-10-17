package com.coding.java.datastructure.scaler.Array.twoD.refresher;

import java.util.Scanner;

/** Title: Sum of Columns of 2D Array
 *
 * Problem Description:
 *
 * Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that represents the sums of the columns of the 2D array C.
 */
public class ColumnSums {
    public static int[] columnSums(int[][] C, int A, int B) {

        int[] result = new int[B];  // Array to store sums of columns
        
        // Iterate over each column
        for (int j = 0; j < B; j++) {
            int sum = 0;
            // Iterate over each row in the current column
            for (int i = 0; i < A; i++) {
                sum += C[i][j];
            }
            result[j] = sum;  // Store the sum of the current column
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows (A) and columns (B)
        System.out.print("Enter number of rows (A): ");
        int A = scanner.nextInt();
        System.out.print("Enter number of columns (B): ");
        int B = scanner.nextInt();

        // Input the 2D array C
        int[][] C = new int[A][B];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                C[i][j] = scanner.nextInt();
            }
        }

        // Get the column sums
        int[] sums = columnSums(C, A, B);

        // Output the column sums
        System.out.println("Column sums:");
        for (int sum : sums) {
            System.out.print(sum + " ");
        }
        System.out.println();

        scanner.close();
    }
}
