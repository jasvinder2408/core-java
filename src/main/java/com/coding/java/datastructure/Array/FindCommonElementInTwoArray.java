package com.coding.java.datastructure.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementInTwoArray {

    /**
     * Time Complexity: O(n^2)
     * Auxiliary Space: O(n)
     *
     */
    private static void FindCommonElemet(String[] arr1,
                                         String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    // main method
    public static void main(String[] args)
    {

        // create Array 1
        String[] arr1
                = { "Article", "in", "Geeks", "for", "Geeks" };

        // create Array 2
        String[] arr2 = { "Geeks", "for", "Geeks" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElemet(arr1, arr2);




        // create Array 1
        int[] intArr1
                = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

        // create Array 2
        int[] intArr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));
        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));
        findCommonElementUsingSet(intArr1, intArr2);
    }

    /**
     * Approach :
     *
     * Get the two Arrays.
     * Create two hashsets and add elements from arrays tp those sets.
     * Find the common elements in both the sets using Collection.retainAll() method. This method keeps only the common elements of both Collection in Collection1.
     * Set 1 now contains the common elements only.
     */
    private static void findCommonElementUsingSet(int [] arr1, int [] arr2){
        // create hashsets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements from array1
        for (int i : arr1) {
            set1.add(i);
        }

        // Adding elements from array2
        for (int i : arr2) {
            set2.add(i);
        }

        // use retainAll() method to
        // find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);

    }
}
