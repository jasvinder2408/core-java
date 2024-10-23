package com.coding.java.datastructure.scaler.Array.OneD.refresher.ArrayDeletion;

import java.util.Arrays;
/*
To remove an element from an array in Java without creating a new array directly, it is not possible since arrays are of fixed size. However, you can simulate the removal of an element by shifting elements to the left to overwrite the element you want to "delete."

This way, you don’t allocate a new array but rather modify the existing array. Keep in mind that after the shift, the last element will be a duplicate of the second-last one, so you may need to reduce the effective length of the array if you are maintaining it elsewhere.

Explanation:
Input Array: {10, 20, 30, 40, 50}
Index to Remove: 2 (which corresponds to the element 30).
Shifting Elements:
Shift all elements from index 2 onward one position to the left.
{10, 20, 40, 50, 50} (after shifting)
Effective Length: After removing, the new length is 4, as the last element is duplicated.

Notes:
In-place Modification: The array is modified in place by shifting the elements, and no new array is created.
Handling Size: The removeElement function returns the new "effective" size of the array, which you can use to avoid accessing the extra element at the end.
This approach uses the original array without allocating a new one. However, if frequent additions and deletions are required, it is generally better to use a dynamic data structure like an ArrayList.
 */
public class RemoveElementInPlace {

    // Function to remove the element at index position
    public static int removeElement(int[] arr, int index) {
        // Check if the index is valid
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr.length;
        }

        // Shift elements to the left starting from index
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Reduce the effective size of the array (since the last element is now a duplicate)
        return arr.length - 1; // Return the new effective length
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));

        int indexToRemove = 0;  // Remove element at index 2 that is element=30

        int newLength = removeElement(arr, indexToRemove);

        System.out.println("Array after removing element at index " + indexToRemove + ": " 
                            + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
