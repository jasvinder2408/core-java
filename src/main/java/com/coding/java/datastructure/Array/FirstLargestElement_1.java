package com.coding.java.datastructure.Array;

import java.util.Arrays;

public class FirstLargestElement_1 {

    private static int array[] = {10, 324, 45, 90, 9808};

    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }


    /**
     *     Method to find maximum in array[]
     *
     *     O(n)
      */
    private static int largest()
    {
        int i;

        // Initialize maximum element
        int max = array[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }


    private void withStreamAPi(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " +max);
    }


}
