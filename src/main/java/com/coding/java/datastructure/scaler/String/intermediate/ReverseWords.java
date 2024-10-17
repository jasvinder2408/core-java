package com.coding.java.datastructure.scaler.String.intermediate;
/*

Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


To solve the problem of reversing a string word by word, while adhering to the constraints of removing extra spaces (leading, trailing, and between words), we need to follow these steps:

Approach:
Trim leading and trailing spaces: We need to remove any extra spaces from the beginning and end of the string.
Split the string by spaces: This will give us the individual words.
Reverse the order of words: The words should appear in reverse order compared to the original string.
Handle multiple spaces: Any extra spaces between words in the original string should be reduced to a single space.

 Explanation:
A.trim(): This removes any leading and trailing spaces from the string.
A.split("\\s+"): The regular expression \\s+ splits the string on one or more spaces, effectively handling multiple spaces between words.
Reversing the words: We traverse the words array in reverse order, appending each word to the reversed string.
Return the result: The final string is returned, which has the words in reverse order with exactly one space between each word and no extra spaces at the start or end.

Example:
=========
Input:

A = "  the sky   is   blue  "

Output:

"blue is sky the"

Time Complexity:
================
Splitting the string takes O(N), where N is the length of the input string.
Reversing the words array also takes O(N).
 */
public class ReverseWords {

    public static String reverseWords(String A) {
        // Step 1: Trim leading and trailing spaces
        A = A.trim();

        // Step 2: Split the string into words using one or more spaces as the delimiter
        String[] words = A.split("\\s+");

        // Step 3: Initialize an empty result string
        String reversed = "";

        // Step 4: Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];  // Add the current word to the result
            if (i != 0) {
                reversed += " ";    // Add a space between words (but not after the last word)
            }
        }

        return reversed;  // Return the final reversed string
    }

    public static void main(String[] args) {
        String A = "  the sky   is   blue  ";
        String result = reverseWords(A);
        System.out.println(result);  // Output: "blue is sky the"
    }
}
