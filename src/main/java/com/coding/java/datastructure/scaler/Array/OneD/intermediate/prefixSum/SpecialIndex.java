package com.coding.java.datastructure.scaler.Array.OneD.intermediate.prefixSum;

/**
 *
 *
 * Plan:
 * ======
 * Prefix Sum Arrays:
 *
 * pfEven[i]: The sum of all even-indexed elements from index 0 to i.
 * pfOdd[i]: The sum of all odd-indexed elements from index 0 to i.
 *
 * Total Sums:
 *
 * sumEven: The total sum of all elements at even indices.
 * sumOdd: The total sum of all elements at odd indices.
 *
 * How to Check Each Index:
 *
 * For each index i:
 * Remove the element at index i.
 * For elements before i, the sums of even and odd indices remain the same.
 * For elements after i, the positions of even and odd indices will shift:
 * If i is even, the elements that were previously at odd indices become even-indexed after removal.
 * If i is odd, the elements that were previously at even indices become odd-indexed after removal.

 * Key Calculation:
 *
 * If removing arr[i] makes the sum of even and odd indexed elements equal, we count that index.
 */
public class SpecialIndex {
    public static int cntIndexesToMakeBalance(int[] A) {

        int count = 0, N = A.length;


        if (N == 1)
            return 1;


        if (N == 2)
            return 0;


        // Step 1: Create prefix sum arrays for even and odd indices

        int[] pfOdd = new int[N];
        int[] pfEven = new int[N];

        pfOdd[0] = 0;
        pfEven[0] = A[0];

        // Calculate the prefix sums for even and odd indices

        for (int i=1; i<N; i++) {

            if (i%2 == 0) {
                pfOdd[i] = pfOdd[i-1];
                pfEven[i] = pfEven[i-1] + A[i];
            }
            else {
                pfOdd[i] = pfOdd[i-1]  + A[i];
                pfEven[i] = pfEven[i-1];
            }
        }
        // PF (even and odd) is ready now

        // Step 2: Count the valid indices where even and odd sums match after removal
        for (int i=0; i<N; i++) {
            int sumOdd = 0, sumEven = 0;

            if (i>0) {
                sumOdd = pfOdd[i-1];
                sumEven = pfEven[i-1];
            }
            sumOdd += pfEven[N-1] - pfEven[i];
            sumEven += pfOdd[N-1] - pfOdd[i];

            if (sumOdd == sumEven)
                count++;
        }


        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7,6,-2};
        System.out.println(cntIndexesToMakeBalance(arr)); // Output: 2


        int[] arr2 = {1, 2, 3};
        System.out.println(cntIndexesToMakeBalance(arr2)); // Output: 0
    }
}
