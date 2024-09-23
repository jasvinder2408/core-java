package com.coding.java.datastructure.scaler.Array1D.refresher;

import java.util.Scanner;

public class PrimeCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int ans = countPrime(A);
        System.out.println(ans);
    }
    public static int countPrime(int A) {

        int pcount=0;
        int count=0;

        for (int i=2; i<=A;i++)
        {
            count=0;

            for (int j=1;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    if(j*j==i) count++;
                    else count+=2;
                }
            }
            if(count==2) pcount++;
        }
        return pcount;
    }
}
