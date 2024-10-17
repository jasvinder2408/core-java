package com.coding.java.datastructure.scaler.String.intermediate;
/*

Problem Description
====================
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.

To solve the problem of finding the number of occurrences of the substring "bob" in a given string A, we can simply iterate through the string and check if the substring "bob" appears at each position.

Approach:
============
Start iterating through the string from the beginning.
For each position i, check if the substring starting from that position matches "bob".
Increment a counter whenever we find a match.
Continue until we have checked all possible starting positions (i.e., from index 0 to N-3, where N is the length of the string).

Explanation:
===============
countBob(String A):
-------------------
1) We initialize a counter count to zero.
2) We iterate over the string from index 0 to n - 3 (since we're checking substrings of length 3).
3) For each index i, we extract the substring from i to i + 3 and check if it equals "bob".
4) If it does, we increment the count.

Time Complexity:
=================
We iterate through the string once, and for each index, we check a substring of length 3.
Thus, the time complexity is O(N), where N is the length of the string.
Example:
Input:

A = "abobcobobbob"
Output:

3
Explanation: The substring "bob" appears 3 times in the string.

"bob" at index 1
"bob" at index 6
"bob" at index 9
This solution efficiently counts the occurrences of "bob" with linear time complexity O(N).
 */
public class CountBobOccurrences {
    
    public static int countBob(String A) {
        int count = 0;  // To store the count of "bob" occurrences
        int n = A.length();
        
        // Iterate through the string, checking for the substring "bob"
        for (int i = 0; i <= n - 3; i++) {
            // Check if the current substring is "bob"
            if (A.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        
        return count;  // Return the total count of "bob"
    }

    public static void main(String[] args) {
        String A = "abobcobobbob";
        int result = countBob(A);
        System.out.println(result);  // Output: 3
    }
}
