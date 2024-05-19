package com.coding.java.datastructure.Array;

import java.util.HashMap;

public class RemoveDuplicateInUnsortedArray {

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
        //int arr[] = {2, 2, 3, 4, 4, 4, 5, 5};

        int n = arr.length;
        removeDups(arr, n);
    }

    /**
     *
     * Take a hash map, which will store all the elements which have appeared before.
     * Traverse the array.
     * Check if the element is present in the hash map.
     * If yes, continue traversing the array.
     * Else Print the element.
     *
     * Time Complexity: O(N)
     * Auxiliary Space: O(N)
     *
     */
    private static void removeDups(int[] arr, int n)
    {

        // Hash map which will store the
        // elements which has appeared previously.
        HashMap<Integer,Boolean> mp = new HashMap<>();

        for (int i = 0; i < n; ++i)
        {

            // Print the element if it is not
            // there in the hash map
            if (mp.get(arr[i]) == null) {
                System.out.print(arr[i] + " ");
            }
            // Insert the element in the hash map
            mp.put(arr[i], true);
        }
    }



}
