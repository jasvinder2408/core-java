package com.coding.java.datastructure.scaler.Array.twoD.intermediate;
/*
Problem Description
You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.

To rotate a given n×n 2D matrix by 90 degrees clockwise in place, you can perform the following steps:

Approach:
Transpose the Matrix: The transpose of a matrix involves flipping the matrix over its main diagonal, swapping elements at A[i][j] with A[j][i].

Reverse Each Row: After transposing the matrix, the elements in each row are reversed to achieve a 90-degree clockwise rotation.

Time Complexity:
The overall time complexity is O(N^2) where N is the number of rows (or columns) in the matrix.

Space Complexity:

Since we are performing the rotation in place, the space complexity is O(1) (no extra space is used).

Steps:
=====
1) Transpose the matrix.
2) Reverse each row of the transposed matrix


Explanation:
===================
Given the matrix:

1  2  3
4  5  6
7  8  9

Step 1 (Transpose): Swap elements to get the transpose.

1  4  7
2  5  8
3  6  9

Step 2 (Reverse each row): Reverse each row to rotate the matrix by 90 degrees.

7  4  1
8  5  2
9  6  3
Thus, the matrix has been rotated 90 degrees clockwise in place.

Output:
=======

7 4 1
8 5 2
9 6 3

This approach meets the requirement of in-place rotation and avoids using additional arrays, ensuring an optimal solution with O(N^2) time complexity and O(1) space complexity.
 */
public class RotateMatrix {
    public static void rotate90Clockwise(int[][] A) {
        int n = A.length;
        
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap A[i][j] with A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            reverseRow(A[i]);
        }
    }
    
    // Helper method to reverse a row
    private static void reverseRow(int[] row) {
        int start = 0, end = row.length - 1;
        while (start < end) {
            // Swap elements at the start and end
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        rotate90Clockwise(matrix);
        
        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Output:
        // 7 4 1
        // 8 5 2
        // 9 6 3
    }
}
