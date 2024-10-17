package com.coding.java.datastructure.scaler.Array.OneD.intermediate.sortingbasics;

import java.util.Arrays;

/**
 *NOT in the Assignment.
 *
 */
public class CountNobleInteger {


    private static int countNobleInteger(int [] arr){

        Arrays.sort(arr);
        int ans =0;

        int N = arr.length;
        if(arr[0]==0) ans ++;
        int count =0;

        for(int i=1; i<N; i++){

            if(arr[i] == arr[i-1]){
                //nothing
            }
            else{
                count = i;
            }
            if(arr[i] == count) ans ++;

        }
        return ans;
    }
    public static void main(String[] args) {

        int [] arr = {1,1, -10, 2,4,4,4,8,10};

        int count = countNobleInteger(arr);

        System.out.println(count);
    }
}
