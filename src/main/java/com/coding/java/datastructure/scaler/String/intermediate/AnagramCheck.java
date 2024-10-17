package com.coding.java.datastructure.scaler.String.intermediate;

/*

Problem Description
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.


Definition:
Two strings are anagrams if they contain the same characters in the same frequencies, but their order can be different.

Approach:
Length Check: First, if the lengths of
𝐴
A and
𝐵
B are different, they can't be anagrams.
Character Frequency: We can create frequency counts for the characters in both strings and compare them. If both strings have the same frequency for each character, they are anagrams.
Optimized Solution:
We can use a frequency array to count the occurrences of each character in both strings.

Steps:

1). Initialize a frequency array count[26] to count the occurrences of each character ('a' to 'z').
2). For each character in string A,increment its corresponding count.
3). For each character in string B, decrement its corresponding count.
4). After processing both strings, if all the values in the frequency array are 0, the strings are anagrams.

Explanation:
Step 1: We check if the lengths of the strings are different. If they are, return 0 immediately.
Step 2: We use a frequency array count[26] where each index corresponds to a letter from 'a' to 'z'.

 => For each character in A, we increment the count at its corresponding index.
 => For each character in B, we decrement the count at its corresponding index.

Step 3: If all values in the count array are 0, it means both strings have the same characters in the same frequency, so they are anagrams. Otherwise, they are not.

Time Complexity:
================
The time complexity is O(N), where N is the length of the string. We iterate through the strings once to update the frequency array.

Space Complexity:
=================
The space complexity is O(1), as the frequency array has a fixed size of 26, regardless of the input size.

Q) Why count array is 26?

The count array is of size 26 because it is designed to count the occurrences of each lowercase English letter, where:

There are 26 letters in the English alphabet (from 'a' to 'z').
The index in the array corresponds to the position of the letter in the alphabet:
Index 0 corresponds to 'a'
Index 1 corresponds to 'b'
Index 2 corresponds to 'c'
And so on, until index 25, which corresponds to 'z'

@) Explain  count[A.charAt(i) - 'a']++;
            count[B.charAt(i) - 'a']--;

Ans).
Let's break down the expression count[A.charAt(i) - 'a']++ and count[B.charAt(i) - 'a']-- in the context of checking whether
two strings A and B are anagrams.

Purpose of the code:
The goal is to count the frequency of each character in both strings A and B. If the strings are anagrams, the frequency of each character should be identical in both strings.

To do this efficiently, we use a single count array of size 26 (for lowercase English letters). As we iterate through both strings, we adjust the counts based on the characters in the respective strings.

Code Breakdown:
1. count[A.charAt(i) - 'a']++
A.charAt(i) gets the character at index i of string A.
Subtracting 'a' from A.charAt(i) maps the character to an index between 0 and 25 (corresponding to the position in the alphabet):
'a' - 'a' = 0
'b' - 'a' = 1
'z' - 'a' = 25
So, for each character in A, this expression increases the count for the corresponding letter in the count array by 1.
2. count[B.charAt(i) - 'a']--
Similarly, B.charAt(i) gets the character at index i of string B.

Subtracting 'a' from B.charAt(i) maps the character to an index between 0 and 25, just like with string A.

But this time, we decrease the count for the corresponding letter in the count array by 1 for each character in B.

Why does this work?
The idea is that if A and B are anagrams, for each character in A that increases a count in the count array, there should be a corresponding character in B that decreases the same count.

By the end of the iteration:

If A and B are anagrams, all entries in the count array will be 0, since every increment (from A) will have a corresponding decrement (from B).
If they are not anagrams, some counts will be non-zero, indicating a mismatch in the frequency of some characters.
Example:
Let’s say A = "abc" and B = "cba".

After processing the first character:
count['a' - 'a']++ (which is count[0]++) → increases count[0] (representing 'a') by 1.
count['c' - 'a']-- (which is count[2]--) → decreases count[2] (representing 'c') by 1.
After processing the second character:
count['b' - 'a']++ (which is count[1]++) → increases count[1] (representing 'b') by 1.
count['b' - 'a']-- (which is count[1]--) → decreases count[1] (representing 'b') by 1.
After processing the third character:
count['c' - 'a']++ (which is count[2]++) → increases count[2] (representing 'c') by 1.
count['a' - 'a']-- (which is count[0]--) → decreases count[0] (representing 'a') by 1.
At the end of the process, all entries in the count array will be 0, meaning A and B are anagrams.
 */
public class AnagramCheck {
    public static int areAnagrams(String A, String B) {
        // If lengths are not the same, they can't be anagrams
        if (A.length() != B.length()) {
            return 0;
        }

        // Create a frequency array for characters 'a' to 'z'
        int[] count = new int[26];

        // Increment counts for characters in A and decrement for characters in B
        for (int i = 0; i < A.length(); i++) {
            count[A.charAt(i) - 'a']++;
            count[B.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return 0; // Not anagrams
            }
        }

        return 1; // Anagrams
    }

    public static void main(String[] args) {
        String A = "abc";
        String B = "cba";
        System.out.println(areAnagrams(A, B));  // Output: 1 (anagrams)
    }
}
