package com.coding.java.datastructure.scaler.Array.OneD.intermediate;

import java.util.HashSet;

public class GoodPairFinder {
    public static boolean hasGoodPair(int[] A, int B) {
        // Step 1: Create a HashSet to store elements we've seen so far
        HashSet<Integer> seen = new HashSet<>();
        
        // Step 2: Iterate through the array
        for (int num : A) {
            // Step 3: Check if the complement exists in the set
            int complement = B - num;
            if (seen.contains(complement)) {
                return true;  // A good pair is found
            }
            // Step 4: Add the current number to the set
            seen.add(num);
        }
        
        // Step 5: If no good pair is found, return false
        return false;
    }
    
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 9};
        int B = 8;
        boolean result = hasGoodPair(A, B);
        System.out.println(result);  // Output: false (no pair sums to 8)
        
        int[] C = {1, 2, 4, 4};
        int D = 8;
        boolean result2 = hasGoodPair(C, D);
        System.out.println(result2);  // Output: true (4 + 4 = 8 is a good pair)
    }
}
