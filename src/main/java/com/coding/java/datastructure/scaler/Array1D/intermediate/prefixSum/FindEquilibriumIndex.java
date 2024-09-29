package com.coding.java.datastructure.scaler.Array1D.intermediate.prefixSum;

public class FindEquilibriumIndex {

    private static int findEquilibriumIndex(int[] A) {

        int n = A.length;
        int ansIndex = -1;

        // Step 1: Create prefix sum array
        int[] psum = new int[n];
        psum[0] = A[0];

        for(int i = 1 ;i<n;i++){
            psum[i] = psum[i-1]+A[i];
        }

        // Step 2:
        for(int i = 0;i<n;i++){
            if(i == 0){
                if(psum[n-1] - psum[0] == 0)
                    ansIndex = 0;
            }
            else if(psum[n-1] - psum[i] == psum[i-1] ){
                ansIndex = i;
                break;
            }
        }
        return ansIndex;
    }
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 2, 2};
        System.out.println(findEquilibriumIndex(arr1)); // Output: 2

        int[] arr2 = {1, 2, 3};
        System.out.println(findEquilibriumIndex(arr2)); // Output: -1

    }
}
