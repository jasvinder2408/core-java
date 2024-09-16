package com.coding.java.datastructure.scaler.Array2D.refresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibilityFilter {
    // Function to return a 2D array where each row contains elements in A that are
    // divisible by B[i]

    public static ArrayList<ArrayList<Integer>> filterByDivisibility(List<Integer> A, List<Integer> B) {

        int n = B.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i < n ; i++){
            ans.add(new ArrayList<Integer>());
        }
        // Iterating over vector B
        for(int i = 0 ; i < n ; i++){
            // Iterating over vector A
            for(int j = 0 ; j < A.size() ; j++){
                if(A.get(j) % B.get(i) == 0){
                    ans.get(i).add(A.get(j));
                }
            }
        }
        return ans;
    }
//    public static int[][] filterByDivisibility(int[] A, int[] B) {
//        int n = B.length; // Number of rows in the resulting 2D array
//         int m = A.length;
//
//         int [] [] result = new int [m][n];
//        for(int i =0; i<= n-1; i++){
//
//            for(int j =0 ; j<= m-1; j++){
//
//                if(A[j] % B[i] ==0 ){
//
//                    result[i][j] =A[j];
//
//                }
//            }
//
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        // Example arrays A and B
       // int[] A = {10, 20, 30, 40, 50};
       // int[] B = {2, 5};
        List<Integer>A = Arrays.asList(10,20,30,40,50);
        List<Integer> B = Arrays.asList(2,5);

        
        // Get the resulting 2D array
        ArrayList<ArrayList<Integer>> result = filterByDivisibility(A, B);
        
        // Print the resulting 2D array
        System.out.println("Resulting 2D array:");
        for (ArrayList<Integer>row : result) {
            System.out.println((row));
        }
    }
}
