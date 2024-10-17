package com.coding.java.datastructure.scaler.String.intermediate;
/*

If you want to avoid using built-in string methods like toUpperCase(), toLowerCase(), or substring(),
we can implement the logic manually by directly manipulating the characters based on their ASCII values.

ASCII Value Explanation:
========================
For lowercase letters: 'a' to 'z' have ASCII values from 97 to 122.
For uppercase letters: 'A' to 'Z' have ASCII values from 65 to 90.

NOTE: The difference between a lowercase and uppercase letter is 32 ('a' - 'A' = 32).

To toggle the case manually, you can:
=====================================
Convert a lowercase letter to uppercase by subtracting 32 from its ASCII value.
Convert an uppercase letter to lowercase by adding 32 to its ASCII value.


Explanation:
==============
1) We iterate over each character of the string.
2) If a character is between 'a' and 'z' (lowercase), we convert it to uppercase by subtracting 32 from its ASCII value.
3) If a character is between 'A' and 'Z' (uppercase), we convert it to lowercase by adding 32 to its ASCII value.

Any non-alphabet character remains unchanged.
Examples of More Case Conversions:
Convert string to uppercase without built-in methods:

Iterate over the string, and for each character, if it's lowercase (between 'a' and 'z'), subtract 32 from its ASCII value to convert it to uppercase.
Convert string to lowercase without built-in methods:

For each character in the string, if it's uppercase (between 'A' and 'Z'), add 32 to its ASCII value to convert it to lowercase.
Capitalize first letter of each word manually:

Traverse the string, and whenever you encounter the first letter of a word (i.e., either the start of the string or a letter following a space), convert it to uppercase if it's lowercase.
 */
public class ToggleCase {

    public static String toggleCase(String A) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // Manually toggle case based on ASCII values
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                result.append((char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                result.append((char)(ch + 32));
            } else {
                // If the character is not an alphabet, keep it unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String A = "AbCdeFGh23";
        String toggledString = toggleCase(A);
        System.out.println(toggledString); // Expected output: "aBcDEfgH"
    }
}
