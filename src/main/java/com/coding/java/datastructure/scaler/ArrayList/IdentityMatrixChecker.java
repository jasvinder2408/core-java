package com.coding.java.datastructure.scaler.ArrayList;

import java.util.Scanner;

/**
 * Title: Is It Identity Matrix?
 *
 * Problem Description
 *
 * You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
 *
 * Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
 */
public class IdentityMatrixChecker {
    // Function to check if a matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] A, int N) {
        // Iterate through the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && A[i][j] != 1) {  // Check main diagonal elements
                    return false;
                }
                if (i != j && A[i][j] != 0) {  // Check non-diagonal elements
                    return false;
                }
            }
        }
        return true;  // Matrix satisfies the identity matrix conditions
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix (N)
        System.out.print("Enter the size of the matrix (N): ");
        int N = scanner.nextInt();

        // Input the matrix elements
        int[][] A = new int[N][N];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is an identity matrix
        if (isIdentityMatrix(A, N)) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        scanner.close();
    }
}
