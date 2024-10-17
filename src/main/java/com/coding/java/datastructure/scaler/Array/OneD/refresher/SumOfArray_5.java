package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.Scanner;

public class SumOfArray_5 {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int [] arr = new int[size];

        for (int i=0; i< size; i++){

            arr[i] = sc.nextInt();
        }

        int sum =0;

        // logic for sum of an array arr.
        for(int j=0; j < arr.length; j++){

            sum = sum + arr[j];
        }

        System.out.println(sum);

    }
}
