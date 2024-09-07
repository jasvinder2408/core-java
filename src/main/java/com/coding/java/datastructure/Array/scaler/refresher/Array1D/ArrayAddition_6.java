package com.coding.java.datastructure.Array.scaler.refresher.Array1D;

/**
 * You are given a constant array A and an integer B.
 *
 * You are required to return another array where outArr[i] = A[i] + B.
 *
 * First argument is a constant array A.
 *
 * Second argument is an integer B.
 *
 * O/p:
 * You have to return an integer array.
 */
public class ArrayAddition_6 {

    public static void main(String[] args) {
        // Example constant array and integer B
        int[] A = {1, 2, 3, 4, 5}; // You can change this array as needed
        int B = 10; // You can change this value as needed

        // Calculate the resulting array
        int[] outArr = addToArray(A, B);

        // Print the resulting array
        System.out.println("Resulting array:");
        for (int num : outArr) {
            System.out.print(num + " ");
        }
    }

    // Method to create a new array where each element is A[i] + B
    public static int[] addToArray(int[] A, int B) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            result[i] = A[i] + B;
        }
        return result;
    }
}
