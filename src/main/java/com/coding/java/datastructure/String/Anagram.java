package com.coding.java.datastructure.String;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "racea";
        String str2 = "care";

        System.out.println(isAnagramUsingMap(str1, str2));
        System.out.println(isAnagramUsingSorting(str1, str2));

    }


    /**
     * Solution
     * ========
     * Take the first hashmap and fill the first string's individual characters as key and value as the character count in the string.
     * Take the second hashmap, and fill the second string's individual characters as key and value as the character count in the string.
     * Check if two hashmaps are equal or not. If they are equal, then the strings are anagrams of each other. Otherwise, they are not
     *
     * Time Complexity: O(l1 + l2) where l1 and l2 are lengths of strings.
     *
     * Auxiliary space: O(m1 + m2) where m1 and m2 are numbers of unique characters in each string.
     */
    private static String isAnagramUsingMap(String str1, String str2) {
        // initialize hashmaps
        HashMap<Character, Integer> hashmap1 = new HashMap<>();
        HashMap<Character, Integer> hashmap2 = new HashMap<>();
        //convert string to character array
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        //for loop for first string
        for (int i = 0; i < arr1.length; i++) {
            //if character not present add to hashmap
            if (hashmap1.get(arr1[i]) == null) {

                hashmap1.put(arr1[i], 1);
            } else {
                Integer c = hashmap1.get(arr1[i]);
                hashmap1.put(arr1[i], ++c);
            }
        }
        //for loop for second string
        for (int j = 0; j < arr2.length; j++) {

            if (hashmap2.get(arr2[j]) == null)
                hashmap2.put(arr2[j], 1);
            else {

                Integer d = hashmap2.get(arr2[j]);
                hashmap2.put(arr2[j], ++d);
            }
        }
        //check if hashmaps are equal
        if (hashmap1.equals(hashmap2))
            return "The two strings are anagrams of each other";
        else
            return "The two strings are NOT anagrams of each other";

    }

    /**
     * Sort both strings.
     * Compare the sorted strings:
     * If they are equal return True.
     * Else return False.
     *
     *
     */
    private static String isAnagramUsingSorting(String str1, String str2){

        char [] charsArray1= str1.toCharArray();
        char [] charsArray2= str2.toCharArray();

        // Get lengths of both strings
        int n1 = charsArray1.length;
        int n2 = charsArray2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return "not anagram";

        // Sort both strings
        Arrays.sort(charsArray1);
        Arrays.sort(charsArray2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (charsArray1[i] != charsArray2[i])
                return "not anagram";

        return "Both are anagram";
    }
}

