package com.coding.java.datastructure.scaler.Array.twoD.refresher;

import java.util.Scanner;

public class WavePrintMatrixRowWise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Input matrix elements
        int[][] Mat = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = sc.nextInt();
            }
        }

        // Print the matrix in wave form
        wavePrintByRow(Mat);
    }

    private static void wavePrintByRow(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i <= n - 1; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j <= n - 1; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {

                for (int j = n - 1; j >= 0; j--) {

                    System.out.print(mat[i][j] + " ");

                }
            }
        }
    }
}
