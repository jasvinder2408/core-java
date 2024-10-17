package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayUsingMap {
    // Function to return an array where B[i] is the frequency of A[i] in array A
    public static int[] frequencyCount(int[] A) {
        int n = A.length;
        int[] B = new int[n];  // Initialize array B of the same size as A
        
        // Create a hash map to store frequency counts
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element in A
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Populate array B with frequency counts
        for (int i = 0; i < n; i++) {
            B[i] = frequencyMap.get(A[i]);
        }
        
        return B;  // Return the resulting array B
    }

    public static void main(String[] args) {
        // Example array A
        int[] A = {1, 2, 3, 2, 1, 1};  // Example input array
        
        // Get the resulting array B
        int[] B = frequencyCount(A);
        
        // Print the resulting array B
        System.out.print("Array B: [");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]);
            if (i < B.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
