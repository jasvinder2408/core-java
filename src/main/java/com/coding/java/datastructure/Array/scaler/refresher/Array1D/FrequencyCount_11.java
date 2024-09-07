package com.coding.java.datastructure.Array.scaler.refresher.Array1D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Problem Description
 * You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
 *
 * Note:
 *
 * When comparing two elements of the ArrayList(java), make sure to use .equals() method for accurate comparison.
 * Eg : To compare ith index with jth index use A.get(i).equals(A.get(j)).
 */
public class FrequencyCount_11 {
    public static List<Integer> frequencyCount(List<Integer> A) {
        int n = A.size();
        List<Integer> frequency = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A.get(i).equals(A.get(j))) {
                    count++;
                }
            }
            frequency.add(count);
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Initialize the array list
        List<Integer> A = new ArrayList<>();

        // Read the array elements
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }

        // Get the frequency count array
        List<Integer> result = frequencyCount(A);

        // Print the result array
        for (int freq : result) {
            System.out.print(freq + " ");
        }

        sc.close();
    }
}
