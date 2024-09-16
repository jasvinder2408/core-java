package com.coding.java.datastructure.scaler.HashMapAndSet;

import java.util.HashSet;

/**
 * Title: Count distinct elements
 *
 * Problem Description
 * Given an array A of N integers, return the number of unique elements in the array.
 *
 * Steps:
 *
 * 1. Use a Set to store unique elements: A Set in Java automatically ensures that only unique elements are stored (it does not allow duplicates).
 * 2. Add each element from the array to the set: As we add elements from the array to the set, duplicates will automatically be ignored.
 * 3. Return the size of the set: The size of the set will give us the number of unique elements in the array.
 *
 */
public class CountDistinctElements {
    public static int countUniqueElements(int[] A) {
        // Step 1: Create a set to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        // Step 2: Add each element to the set
        for (int num : A) {
            uniqueElements.add(num);
        }
        
        // Step 3: Return the size of the set, which represents the number of unique elements
        return uniqueElements.size();
    }
    
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 4, 6, 8};
        int result = countUniqueElements(A);
        System.out.println(result);  // Output: 5 (since 4, 5, 6, 7, and 8 are unique)
    }
}
