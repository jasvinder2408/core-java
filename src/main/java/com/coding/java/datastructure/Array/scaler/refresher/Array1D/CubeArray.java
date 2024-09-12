package com.coding.java.datastructure.Array.scaler.refresher.Array1D;

import java.util.Arrays;

public class CubeArray {
    // Function to return array B where B[i] = A[i]^3
    public static int[] cubeArrayElements(int[] A) {
        int n = A.length;
        int[] B = new int[n];  // Initialize array B of the same size as A
        
        // Calculate the cube of each element of A and store in B
        for (int i = 0; i < n; i++) {
            B[i] = A[i] * A[i] * A[i];  // Cube of A[i]
        }
        
        return B;  // Return the resulting array B
    }

    public static void main(String[] args) {
        // Example array A
        int[] A = {1, 2, 3, 4};  // Example input array
        
        // Get the resulting array B
        int[] B = cubeArrayElements(A);
        
        // Print the resulting array B
        System.out.println("Array B: " + Arrays.toString(B));
    }
}
