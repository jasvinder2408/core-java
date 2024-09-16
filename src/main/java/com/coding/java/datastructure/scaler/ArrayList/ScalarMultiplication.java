package com.coding.java.datastructure.scaler.ArrayList;

import java.util.Scanner;

/**
 * Title: Matrix Scalar Product
 * Problem Description
 * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 */
public class ScalarMultiplication {
    // Function to perform scalar multiplication of matrix A by B
    public static int[][] scalarMultiply(int[][] A, int N, int M, int B) {
        int[][] result = new int[N][M];  // To store the result of the multiplication
        
        // Multiply each element of the matrix by B
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i][j] = A[i][j] * B;
            }
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

        // Input the matrix A
        int[][] A = new int[N][M];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Input the scalar value B
        System.out.print("Enter the scalar value (B): ");
        int B = scanner.nextInt();

        // Perform scalar multiplication
        int[][] result = scalarMultiply(A, N, M, B);

        // Output the result matrix
        System.out.println("Resultant matrix after scalar multiplication:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();  // Move to next row
        }

        scanner.close();
    }
}
