package com.coding.java.datastructure.Array;

public class RemoveDuplicateInSortedArray {

    public static void main (String[] args)
    {
        int arr[] = {2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;

        n = removeDuplicatesInSortedArray(arr, n);

        //n=removeDuplicatesWithNaiveApproach(arr,n);
        // Print updated array
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    /**
     * Create an auxiliary array temp[] to store unique elements.
     * Traverse input array and one by one copy unique elements of arr[] to temp[].
     * Also, keep track of the count of unique elements. Let this count be j.
     * Copy j elements from temp[] to arr[] and return j.
     */
    private static int removeDuplicatesWithNaiveApproach(int arr[], int n)
    {
        // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;

        for (int i = 0; i < n - 1; i++) {

            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    /**
     * Traverse input array from i = 0 to N:
     * Keep track of the count of unique elements. Let this count be j.
     * Swap arr[j] with arr[i].
     * At last, return j.
     *
     * Time Complexity: O(N)
     * Auxiliary Space: O(1)
     */
    private static int removeDuplicatesInSortedArray(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;

        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n-1; i++){
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }


        arr[j++] = arr[n-1];

        return j;
    }



}
