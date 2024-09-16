package com.coding.java.datastructure.scaler.Array1D.intermediate;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr= {4,6,1,7,8};

        reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr) {

        int i=0;
        int j=arr.length-1;

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
