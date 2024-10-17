package com.coding.java.datastructure.scaler.Array.OneD.intermediate;

/**
 *
 * Title : Find Perfect Numbers
 *
 * Problem Description
 * You are given an integer A. You have to tell whether it is a perfect number or not.
 *
 *
 * Problem Constraints
 * 1 <= A <= 10^6
 *
 *
 * Key Observations:
 * A perfect number is a positive integer that is equal to the sum of its proper divisors.
 *
 * Proper divisors of a number A are divisors that are strictly less than A.
 *
 * For example, for A = 6, the proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
 * If the sum of all proper divisors of A equals A itself, then A is a perfect number.
 *
 * Approach:
 *
 * Find the divisors: Iterate through numbers from 1 to A/2 (inclusive) and check if each number is a divisor of A. A divisor is a number that divides A evenly (i.e., A % i == 0).
 * Sum the divisors: Keep a running total of all divisors.
 * Check if the sum equals A: If the sum of divisors is equal to A, then it is a perfect number. Otherwise, it is not.
 *
 * Steps:
 *
 * Initialize a variable sumDivisors to store the sum of the proper divisors.
 * Loop through numbers from 1 to A/2, and if the number is a divisor, add it to sumDivisors.
 * Compare sumDivisors with A. If they are equal, return 1 (true); otherwise, return 0 (false).
 */
public class PerfectNumber {
    public static int isPerfectNumber(int A) {
        if (A <= 1) {
            return 0; // A perfect number is always greater than 1
        }
        
        // Step 1: Find the sum of proper divisors of A
        int sumDivisors = 0;
        for (int i = 1; i <= A / 2; i++) {
            if (A % i == 0) {
                sumDivisors += i;
            }
        }
        
        // Step 2: Check if the sum of proper divisors equals A
        if (sumDivisors == A) {
            return 1; // A is a perfect number
        } else {
            return 0; // A is not a perfect number
        }
    }

    public static void main(String[] args) {
        int A = 28;
        System.out.println("Is " + A + " a perfect number? " + (isPerfectNumber(A) == 1 ? "Yes" : "No")); // Output: Yes

        int B = 12;
        System.out.println("Is " + B + " a perfect number? " + (isPerfectNumber(B) == 1 ? "Yes" : "No")); // Output: No
    }
}
