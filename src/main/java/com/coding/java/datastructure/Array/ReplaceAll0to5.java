package com.coding.java.datastructure.Array;

/**
 * Tag: Amazon (Basic)
 */

/**
 * Recursive Approach:
 * The idea is simple, we get the last digit using mod operator ‘%’. If the digit is 0, we replace it with 5,
 * otherwise, keep it as it is. Then we recur for the remaining digits. The approach remains the same,
 * the basic difference is the loop is replaced by a recursive function.
 *
 * Algorithm:
 *
 *1. Check a base case when the number is 0 return 5, for all other cases form a recursive function.
 *2. The function (solve(int n))can be defined as follows, if the number passed is 0 then return 0, else extract the last digit i.e. n = n/10 and
 *   remove the last digit. If the last digit is zero the assign 5 to it.
 *3. Now return the value by calling the recursive function for n, i.e return solve(n)*10 + digit.
 *4. Print the answer.
 */
public class ReplaceAll0to5 {

    // Driver function
    public static void main(String[] args)
    {
        System.out.println(convert0To5(10120));
    }

    // A recursive function to replace all 0s with 5s in
    // an input number. It doesn't work if input number
    // itself is 0.
    private static int convert0To5Rec(int num)
    {
        // Base case
        if (num == 0)
            return 0;

        // Extract the last digit and change it if needed
        int digit = num % 10;
        if (digit == 0)
            digit = 5;

        // Convert remaining digits and append the
        // last digit
        return convert0To5Rec(num / 10) * 10 + digit;
    }

    // It handles 0 and calls convert0To5Rec() for
    // other numbers
    private static int convert0To5(int num)
    {
        if (num == 0)
            return 5;
        else
            return convert0To5Rec(num);
    }

    /**
     * using inbuilt function(Very simple)
     */
    private static String change(int n){
        String temp  = n + "";
        return temp.replace('0','5');
    }

}
