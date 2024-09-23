package com.coding.java.datastructure.scaler.Array1D.refresher;

import java.util.Scanner;

/**
 * For large numbers, the brute force method of checking divisibility for all numbers up to A would be inefficient. Instead, we can use a more optimized approach based on square roots:
 * Optimized approach: Check divisibility only up to the square root of A. If A is divisible by any number from 2 to √A, it is not prime.
 *
 * Edge cases: Handle small numbers, such as A <= 1, separately since these numbers are not prime by definition.
 */
public class IsPrimeOptimized {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int ans = isPrime(A);
        System.out.println(ans);
    }

    /**
     * Time Complexity:
     * O(√A): We are only checking divisibility up to the square root of A, which reduces the number of iterations significantly compared to checking all numbers up to A.
     *
     * Space Complexity:
     * O(1): The algorithm uses a fixed amount of space regardless of the size of A
     */
    public static int isPrime(int A) {

        // Edge Case
        if(A <= 1) {
            return 0;
        }

        int count = factorCount(A);

        if(count == 0) {
            return 1;
        }

        return 0;
    }

    public static int factorCount(int A) {

        int count = 0;

        // int N = A.length;

        for(int i = 2; i*i <= A ; i++) {

            if(A % i == 0) {
                count = count + 2;
                //break;
            }
            if(i*i == A){
                count = count -1;
            }
        }

        return count;
    }
}
