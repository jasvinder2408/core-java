package com.coding.java.datastructure.Array;

/**
 *
 * 1) Initialize the first as 0(i.e, index of arr[0] element
 * 2) Start traversing the array from array[1],
 *    a) If the current element in array say arr[i] is greater
 *       than first. Then update first and second as,
 *       second = first
 *       first = arr[i]
 *    b) If the current element is in between first and second,
 *       then update second to store the value of current variable as
 *       second = arr[i]
 * 3) Return the value stored in second.
 */
public class SecondLargestElement_3 {

    /** Efficient solution
     * Complexity Analysis:
     *
     * Time Complexity: O(n): Only one traversal of the array is needed.
     *
     * Auxiliary space: O(1): As no extra space is required.
     */
    public static void print2largest(int arr[],int arr_size)
    {
        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }

        // main Logic
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
