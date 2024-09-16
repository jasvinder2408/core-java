package com.coding.java.datastructure.scaler.Array1D.intermediate;

import java.util.Arrays;

/**
 * Title: Array rotation
 *
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <=109
 * 1 <= B <= 109
 */
public class ArrayRotation {
    // Function to reverse a portion of the array
    public static void reversePart(int[] A, int start, int end) {

        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }
    
    // Function to rotate the array to the right by B positions
    public static int[] rotateArray(int[] A, int K) {
        int N = A.length;
        K = K % N;  // Normalize B (if B > N, rotating by B is the same as B % N)
        
        // Step 1: Reverse the entire array
        reversePart(A, 0, N - 1);
        
        // Step 2: Reverse the first B elements
        reversePart(A, 0, K - 1);
        
        // Step 3: Reverse the remaining N-B elements
        reversePart(A, K, N - 1);
        
        return A;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 2;
        
        System.out.println("Original Array: " + Arrays.toString(A));
        rotateArray(A, B);
        System.out.println("Array after rotating " + B + " times: " + Arrays.toString(A));
    }
}
