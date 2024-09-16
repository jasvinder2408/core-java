package com.coding.java.datastructure.scaler.Array1D.intermediate;

import java.util.Arrays;

/**
 * Title: Reverse in a range
 *
 * Problem Description
 * Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * 0 <= B <= C <= N - 1
 */
public class ReverseArrayPart {

    public static void main(String[] args) {

        int [] arr= {4,6,1,7,8,10,2,55};

        int start =2;
        int end = 5;
        reverseArrayPart(arr, start, end);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }

    private static void reverseArrayPart(int[] arr, int start, int end) {

        int i=start;
        int j=end;

        while(i<j){

            //swap(arr[i], arr[j]);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

    private static void swap(int a, int b){

        int temp=0;

        temp =a;
        a=b;
        b=temp;
    }
}
