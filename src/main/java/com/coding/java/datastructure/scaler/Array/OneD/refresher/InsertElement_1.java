package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.Scanner;

public class InsertElement_1 {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a[] = new int[n+1];

        // looping from 0 to n-1
        for(int i=0;i<n;i++) {
            a[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int y = scn.nextInt();

        n = n + 1;

        // looping from n-1 to x
        for(int i=n-1;i>x-1;i--) {
            a[i] = a[i-1];
        }
        a[x-1] = y;
        // looping from 0 to n-1
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }
}