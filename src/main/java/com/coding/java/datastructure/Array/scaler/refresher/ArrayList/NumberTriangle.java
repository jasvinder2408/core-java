package com.coding.java.datastructure.Array.scaler.refresher.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Return Numeric Stair Pattern.
 *
 * Problem Description
 * Given an integer A in the function parameter.
 * Return a 2D array with A rows such that the i-th row has numbers from 1 to i.
 */
public class NumberTriangle {
    // Function to generate 2D array with A rows, where the i-th row has numbers from 1 to i
    public static List<List<Integer>> generateTriangle(int A) {
        List<List<Integer>> result = new ArrayList<>();  // To store the 2D array
        
        // Iterate over each row from 1 to A
        for (int i = 1; i <= A; i++) {
            List<Integer> row = new ArrayList<>();  // Create a new row
            for (int j = 1; j <= i; j++) {
                row.add(j);  // Add numbers from 1 to i in the row
            }
            result.add(row);  // Add the row to the result
        }
        
        return result;
    }

    public static void main(String[] args) {
        int A = 5;  // Example value for A
        List<List<Integer>> triangle = generateTriangle(A);
        
        // Print the generated 2D array
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();  // Move to next row
        }
    }
}
