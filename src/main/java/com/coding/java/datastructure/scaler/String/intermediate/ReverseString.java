package com.coding.java.datastructure.scaler.String.intermediate;

/*

Title: . Simple Reverse

Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.

You can reverse a string in Java without using built-in methods by iterating over the string from the end and appending each character to a new string.

Explanation:
We create an empty StringBuilder to store the reversed string.
We loop through the original string starting from the last character (A.length() - 1) and move to the first (i = 0).
We use A.charAt(i) to get each character and append it to the StringBuilder.
Finally, we convert the StringBuilder to a string and return it.
Example:
For input A = "hello", the output will be "olleh".

This approach manually reverses the string without using any built-in methods like StringBuilder.reverse().
 */
public class ReverseString {

    public static String reverseString(String A) {
        StringBuilder reversed = new StringBuilder();
        
        // Iterate over the string from the end to the beginning
        for (int i = A.length() - 1; i >= 0; i--) {
            reversed.append(A.charAt(i));
        }

        // Convert StringBuilder back to a string
        return reversed.toString();
    }

    public static void main(String[] args) {
        String A = "hello";
        String reversed = reverseString(A);
        System.out.println(reversed); // Output: "olleh"
    }
}
