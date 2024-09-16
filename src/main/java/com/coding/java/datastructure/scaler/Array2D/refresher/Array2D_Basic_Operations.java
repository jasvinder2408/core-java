package com.coding.java.datastructure.scaler.Array2D.refresher;// Online Java Compiler
import java.util.*;
// Use this editor to write, compile and run your Java code online
public class Array2D_Basic_Operations {


  public static void printTopRow(int[][] mat) {

    /**understand your 2D array is basically
    1D array of rows. [row1,row2,row3, .....]

    **/
    int n = mat.length; // no of rows
    int m = mat[0].length; //no of cols
    
    for(int i = 0; i<m ; i++) {
      //print the ith column of the 0th row
      System.out.print(mat[0][i] + " ");
    }
  }

  public static void printLeftColumn(int[][] mat) {
    int n = mat.length; //rows
    int m = mat[0].length; // cols

    for(int i = 0; i<n ; i++) {
      //print ith row of the 0th col
      System.out.print(mat[i][0] + " ");
    }

  }
  public static void printRowByRow(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    
    for(int i=0; i<n;i++) {
      //print the ith row. 
      for(int j = 0; j<m; j++) {
        //print the jth col in this ith row
        System.out.print(mat[i][j] + " ");
      }

      System.out.println();
    }

  }
  public static void printColByCol(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    for(int i = 0; i<m ; i++) {
      //print ith column
      for(int j = 0; j<n;j++) {
        //print jth row for the ith column
        System.out.print(mat[j][i] + " ");
      }
      System.out.println();
    }
  }
  public static void printMatrixSum(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int sum = 0;
    //iterate ovr 2D matrix
    for(int i =0;i<n; i++) {
      //iterate ith row
      for(int j = 0; j<m;j++) {
        // add jth col of ith row
        sum = sum + mat[i][j];
      }
    }
    System.out.print(sum);
  }

  public static void printWaveform(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    for(int i =0 ;i <=n-1 ;i++) {
      //print ith row
      if(i%2==0) {
        //print this row, left to right
        for(int j = 0; j<= m-1;j++) {
          System.out.print(mat[i][j] + " ");
        }
      }
      else {
        //print this row, right to left
        for(int j = m-1; j>=0; j--) {
          System.out.print(mat[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
  public static void printRowWiseSum(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    for(int i =0; i<n;i++) {
      //find sum of ith row
      int sum = 0; 
      for(int j = 0; j<m;j++) sum = sum+mat[i][j];
      System.out.print(sum+ " ");
    }
  }
  public static void printColwiseSum(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;

    for(int i = 0 ; i <m ; i++) {
      //find sum of ith column.
      int sum = 0;
      for(int j=0; j<n; j++) sum = sum + mat[j][i];
      System.out.print(sum + " ");
    }
  }
    public static void printMaxColSum(int[][] mat) {
    int n = mat.length;
    int m = mat[0].length;
    int maxColSum = Integer.MIN_VALUE;
    for(int i = 0 ; i <m ; i++) {
      //find sum of ith column.
      int sum = 0;
      for(int j=0; j<n; j++) sum = sum + mat[j][i];
      // sum = sum of ith column
      if(sum > maxColSum) maxColSum = sum;
    }
    System.out.print(maxColSum);
  }
  public static void main(String[] args) {
      // int mat[][] = new int[5][10];
      // mat[0][0]=10;
      // System.out.println(mat[0][0]);

      //Q1. Given a matrix. Print it's top row.
      /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 5 6 4 1
      **/

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); //rows
    int m = scn.nextInt(); //cols

    int[][] mat = new int[n][m];

    for(int i=0;i <= n-1;i++) {
      for(int j=0;j <= m-1;j++) {

        mat[i][j]=scn.nextInt();
      }
    }
    //printTopRow(mat);

    //Q2. Given a matrix, print the leftmost
    // column of a matrix.

    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 5 1 9
    **/
    //printLeftColumn(mat);

    //Q3. Given a matrix N*M. print row by row.
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 5 6 4 1
                  1 2 3 4
                  9 1 5 6
    **/
    //printRowByRow(mat);

    //Q4. Given a matrix N*M. print column bu column
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 5 1 9
                  6 2 1
                  4 3 5
                  1 4 6
    **/
    //printColByCol(mat);

    //Q5. Given a matrix N*M. print its sum;
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 47
    **/
    //printMatrixSum(mat);

    //Q6. Given a matrix of size N*M, print 
    // it in waveform
    /** input:4*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6
            (3)   2  5  4  2
          
          output:  5 6 4 1
                   4 3 2 1
                   9 1 5 6
                   2 4 5 2
    **/ 
    printWaveform(mat);

    //Q7. Given a matrix N*M, 
    // return a row-wise sum.
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 16 10 21
    **/
    //printRowWiseSum(mat);

    //Q8. Given a matrix N*M. 
    //print column wise sum
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 15 9 12 11
    **/
    //printColwiseSum(mat);

    //Q9. Given a matrix N*M. 
    // find the max column sum
    /** input:3*4 matrix
                 (0)(1)(2)(3)
            (0)   5  6  4  1
            (1)   1  2  3  4
            (2)   9  1  5  6

          output: 15
    **/
   // printMaxColSum(mat);
  }
}