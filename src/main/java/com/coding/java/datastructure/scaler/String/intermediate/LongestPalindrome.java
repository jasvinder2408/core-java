package com.coding.java.datastructure.scaler.String.intermediate;
/*

Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).

To solve the problem of finding the longest palindromic substring in a given string, we can use a few approaches, but one of the most efficient is the expand-around-center approach.

Key Insights:
A palindrome mirrors around its center. Hence, a palindrome can either have a single center (odd-length palindrome) or two adjacent centers (even-length palindrome).
For every character (or pair of characters) in the string, we can expand around the center to check the longest palindrome that can be formed.
Steps:
Iterate over each character in the string. Treat each character and each pair of adjacent characters as a possible center of a palindrome.
Expand from the center to the left and right as long as the characters match, keeping track of the longest palindrome found.
Return the substring that corresponds to the longest palindrome.
Approach Details:
Use two functions to handle odd-length and even-length palindromes separately.
If there are multiple palindromes of the same length, return the one that occurs first.


Explanation:
expandAroundCenter(String s, int left, int right):

Expands around the given center indices left and right as long as the characters on both sides match.
Returns the palindromic substring that can be formed by expanding around the center.
longestPalindrome(String A):

Iterates through every character of the string.
For each character:
It checks for the longest odd-length palindrome (centered at i).
It checks for the longest even-length palindrome (centered between i and i + 1).
Updates the result to keep track of the longest palindrome found so far.

Time Complexity:
==================
For each character in the string, the expand operation takes linear time, so the overall complexity is O(N2 ), where N is the length of the string.
Example:
Input:

A = "babad"
Output:

"bab" or "aba" (either is correct, depending on the center chosen first)
Input:

A = "cbbd"
Output:

"bb"
This approach ensures that we find the longest palindromic substring in O(N2 ) time with O(1) space, apart from the input and output storage.

 */
public class LongestPalindrome {

    // Function to expand around the center and return the longest palindrome
    private static String expandAroundCenter(String s, int left, int right) {
        // Expand the window as long as we have a palindrome
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindromic substring
        return s.substring(left + 1, right);  // left+1 and right is exclusive
    }

    public static String longestPalindrome(String A) {
        if (A == null || A.length() == 0) return "";

        String longest = "";  // To store the longest palindrome found

        // Iterate through each character as the center of a palindrome
        for (int i = 0; i < A.length(); i++) {
            // Odd-length palindromes (single character center)
            String oddPalindrome = expandAroundCenter(A, i, i);

            // Even-length palindromes (adjacent pair center)
            String evenPalindrome = expandAroundCenter(A, i, i + 1);

            // Update the longest palindrome found
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;  // Return the longest palindromic substring
    }

    public static void main(String[] args) {
        String A = "babad";
        String result = longestPalindrome(A);
        System.out.println(result);  // Output: "bab" or "aba"
    }
}
