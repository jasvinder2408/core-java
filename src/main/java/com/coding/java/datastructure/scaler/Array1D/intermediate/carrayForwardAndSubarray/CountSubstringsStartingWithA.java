package com.coding.java.datastructure.scaler.Array1D.intermediate.carrayForwardAndSubarray;

/**
 * Approach:
 * Understanding Substrings:
 *
 * A substring is a contiguous part of a string.
 * For each occurrence of the character 'a', all substrings starting from that occurrence and ending at any later position are valid substrings.
 * For each occurrence of 'a':
 *
 * Count all substrings that start from the index of that 'a' and go to every character that follows it, including the entire string.
 * Steps:
 *
 * Iterate through the string and look for each occurrence of the character 'a'.
 * For each occurrence of 'a' at index i, the number of possible substrings starting at that index is equal to the number of characters from index i to the end of the string, which is N - i (where N is the length of the string).
 * Sum these counts for all occurrences of 'a'.
 *
 * Example:
 * For the string A = "amazon":
 *
 * The length of the string N = 6.
 * The character 'a' occurs at indices 0 and 2.
 * For each occurrence:
 *
 * At index 0: Possible substrings starting from index 0 are:
 * "a", "am", "ama", "amaz", "amazo", "amazon".
 * Count = 6 substrings.
 * At index 2: Possible substrings starting from index 2 are:
 * "a", "az", "azo", "azon".
 * Count = 4 substrings.
 * The total count is 6 + 4 = 10.
 *
 * Explanation:
 * =============
 * Iterate through the string: We loop through each character in the string.
 * Check if the character is 'a': For each 'a' found at index i, the number of valid substrings starting at i is n - i, where n is the length of the string.
 * Sum the results for all occurrences of 'a'.
 * Time Complexity:
 * The time complexity is O(N), where N is the length of the string, since we are iterating through the string only once.
 */
public class CountSubstringsStartingWithA {
    public static int countSubstringsStartingWithA(String A) {
        int count = 0;
        int n = A.length();
        
        // Iterate over each character of the string
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'a') {
                // Add all substrings starting from this 'a'
                count += (n - i);
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String A = "amazon";
        System.out.println(countSubstringsStartingWithA(A));  // Output: 10
    }
}
