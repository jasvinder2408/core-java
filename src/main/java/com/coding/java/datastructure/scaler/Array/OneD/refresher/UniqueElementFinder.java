package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.Scanner;

/**
 * Title: Unique Element.
 *
 * Problem Description
 *
 * Given an Array of integers A, every element in it is repeated twice except one, find that unique element.

 Approach:
 Example:

 The array is [1, 2, 3, 2, 1].

 Applying XOR on all elements:
 1 ⊕ 2 ⊕ 3 ⊕ 2 ⊕ 1 = 3

 1⊕2⊕3⊕2⊕1=3

 All repeated elements cancel out, and the result is the unique element 3
 */
public class UniqueElementFinder {
    // Function to find the unique element in the array
    public static int findUniqueElement(int[] A) {
        int result = 0;
        
        // XOR all the elements in the array
        for (int num : A) {
            result ^= num;
        }
        
        return result;  // The result will be the unique element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();
        
        // Input the elements of the array
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Find and print the unique element
        int uniqueElement = findUniqueElement(A);
        System.out.println("The unique element is: " + uniqueElement);

        scanner.close();
    }
}
