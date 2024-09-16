package com.coding.java.datastructure.scaler.HashMapAndSet;

import java.util.HashMap;

/**
 * Title: Count unique elements
 *
 * Problem Description
 * You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
 */
public class CountUniqueElement {
    public static int countUniqueElements(int[] A) {
        // Step 1: Create a frequency map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Step 2: Count the frequency of each element
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 3: Count elements with frequency of 1
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == 1) {
                count++;
                //count = frequencyMap.get()
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 4, 6, 8};  // Only the element 5,7,8 has a frequency 1.

        int result = countUniqueElements(A);
        System.out.println(result);  // Output: 3 (since 5, 7, and 8 appear exactly once)
    }
}
