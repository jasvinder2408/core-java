package com.coding.java.datastructure.scaler.HashMapAndSet;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * Title: Frequency of element query
 *
 * Given an array A. You have some integers given in the array B.
 * For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
 *
 *
 * Steps:
 * 1.Create a frequency map for array A: First, count the frequency of each element in array A using a HashMap.
 * 2. Look up the frequency for each element in B: For each element in B, check its frequency in the frequency map we created from A. If an element does not exist in A, its frequency will be 0.
 * 3. Return the result as a list: Store the frequencies in a list and return it.
 *
 */
public class FrequencyOfElementQuery {
//    public static List<Integer> findFrequencies(int[] A, int[] B) {
//        // Step 1: Create a frequency map for array A
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//
//        for (int num : A) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Step 2: Find the frequency of each element in B
//        List<Integer> result = new ArrayList<>();
//        for (int num : B) {
//            result.add(frequencyMap.getOrDefault(num, 0));
//        }
//
//        return result;
//    }
//


    public static int[] findFrequencies(int[] A, int[] B) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0 ; i < A.length ; i++){

            if(freq.containsKey(A[i])){

                freq.put(A[i], freq.get(A[i]) + 1);
            }
            else{
                freq.put(A[i], 1);
            }
        }
        int[] ans = new int[B.length];

        for(int i = 0 ; i < B.length ; i++){
            if(freq.containsKey(B[i])){
                ans[i] = freq.get(B[i]);
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 4, 2, 5};
        int[] B = {2, 4, 6};
//        List<Integer> result = findFrequencies(A, B);
        int [] result = findFrequencies(A, B);

        for(int res : result){
            System.out.print(res + " ");  // Output: [3, 1, 0] (2 occurs 3 times, 4 occurs 1 time, 6 occurs 0 times)

        }

    }
}
