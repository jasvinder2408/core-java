package com.coding.java.datastructure.Array;

import java.util.HashSet;
import java.util.Set;

public class PrintPairWithGivenSum {

    /**
     * Using Hashing
     *
     * Initialize an empty hash set.
     * Traverse through the array.
     * For each element in the array, check if the difference between the sum and the current element exists
     * in the hash set. If it exists, print the pair.
     * Add the current element to the hash set.
     *
     * Time Complexity: O(n)
     * Auxiliary Space: O(n)
     * */
    public static void printPairsUsingHashing(int[] arr, int n, int sum) {

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int temp = sum - arr[i];

            if (s.contains(temp)) {
                System.out.println("(" + temp + ", " + arr[i] + ")");
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5,-1};
        int sum = 6;
        int n = arr.length;
        printPairsUsingHashing(arr, n, sum);
    }
}
