package com.coding.java.datastructure.scaler.Array.OneD.intermediate.carrayForwardAndSubarray;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 *
 * NOTE: The rightmost element is always a leader.
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 108
 *
 *
 * Approach:
 * Start from the rightmost element (which is always a leader).
 * Traverse the array from right to left.
 * Keep track of the maximum element found so far from the right.
 * If the current element is greater than the maximum element encountered so far, mark it as a leader and update the maximum element.
 * Steps:
 * Initialize an empty list to store leaders.
 * Initialize the maximum element as the rightmost element of the array (since the last element is always a leader).
 * Traverse the array from right to left.
 * For each element, check if it is greater than the current maximum. If yes, add it to the leader list and update the maximum.
 * Return the list of leaders in reverse order since we traverse from right to left.
 *
 * Example:
 * Let's say A = [16, 17, 4, 3, 5, 2]:
 *
 * Start from the rightmost element 2 (it's a leader).
 * The next element to its left is 5, which is greater than 2, so it’s a leader.
 * Then check 3, which is less than 5, so it's not a leader.
 * The next element 4 is also less than 5, so it's not a leader.
 * The next element 17 is greater than 5, so it's a leader.
 * The first element 16 is less than 17, so it's not a leader.
 * The leaders are: [17, 5, 2].
 *
 *
 * Explanation:
 * Rightmost element is always a leader, so we start by adding A[n-1] to the leaders list.
 * Loop through the array from right to left:
 * If the current element is greater than maxFromRight, it is a leader, and we update maxFromRight.
 * Add the current element to the leaders list.
 *
 * Return the int[]: The function now returns the int[] of leaders.
 *
 *
 * Time Complexity:
 * The time complexity is O(N), where N is the length of the array. This is because we only traverse the array once.
 *
 * Space: O(1)
 *
 *
 */
public class LeadersInAnArray {
    public static int[] findLeaders(int[] A) {
        int n = A.length;
        ArrayList<Integer> leadersList = new ArrayList<>();
        
        // Start with the rightmost element
        int maxFromRight = A[n - 1];
        leadersList.add(maxFromRight);  // The last element is always a leader
        
        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > maxFromRight) {
                leadersList.add(A[i]);
                maxFromRight = A[i];  // Update the maximum element
            }
        }
        
        // Reverse the leadersList since leaders were added from right to left
        int size = leadersList.size();
        int[] leadersArray = new int[size];
        for (int i = 0; i < size; i++) {
            leadersArray[i] = leadersList.get(size - 1 - i);  // Reverse while converting to array
        }
        
        return leadersArray;
    }
    
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(A);
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
        // Output: 17 5 2
    }
}
