package com.coding.java.datastructure.scaler.Array.OneD.intermediate.sortingbasics;

import java.util.Arrays;

/**
 * Problem Explanation:
 * You are given an integer array A of size N. In one operation, you can remove any element from the array, and the cost of the operation is the sum of all elements that are still present in the array before the removal.
 *
 * The goal is to find the minimum cost to remove all the elements from the array. The cost for each operation is the sum of the current elements in the array, so the order in which you remove the elements matters. To minimize the cost, you should remove elements that contribute the most to the sum as late as possible.
 *
 * Key Observation:
 * To minimize the total cost:
 *
 * Remove the smaller elements first and larger elements last. This way, the larger elements remain in the array longer, contributing less to the cumulative removal cost.
 * Approach:
 * Sort the array in descending order. This ensures that the larger elements are removed later, minimizing their contribution to the removal cost.
 * The total cost is calculated by repeatedly summing the current array values after each removal.
 * Steps:
 * Sort the array in descending order.
 * For each element in the sorted array, keep a cumulative sum and multiply it by the remaining number of elements to calculate the total cost.
 * Return the total cost.
 *
 * Explanation:
 * Sorting: First, the array is sorted in descending order so that larger numbers stay in the array longer and are removed last, contributing less to the cost.
 * Summing: After sorting, for each element, multiply its value by the number of elements still remaining (including the current one) and add this to the total cost.
 * Example:
 * For the input array A = [4, 2, 1, 3]:
 *
 * After sorting: [4, 3, 2, 1]
 * The cost calculations:
 * Removing 4 last: 4 * 4 = 16
 * Removing 3: 3 * 3 = 9
 * Removing 2: 2 * 2 = 4
 * Removing 1: 1 * 1 = 1
 * Total cost: 16 + 9 + 4 + 1 = 30.
 * Thus, the minimum cost is 30.
 *
 * Time Complexity:
 * O(N log N) for sorting the array.
 * O(N) for calculating the total cost after sorting.
 * So the total time complexity is O(N log N).
 * Space Complexity:
 * O(1) extra space is used aside from the input array (if we sort it in place).
 */
public class MinRemovalCost {
    public static int minRemovalCost(int[] A) {
        // Sort the array in descending order
        Arrays.sort(A);
        int n = A.length;
        int totalCost = 0;
        
        // Calculate the minimum cost
        for (int i = 0; i < n; i++) {
            totalCost += A[i] * (n - i);  // Multiply the element by the remaining elements
        }
        
        return totalCost;
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 1, 3};
        int result = minRemovalCost(A);
        System.out.println(result);  // Output the minimum cost
    }
}
