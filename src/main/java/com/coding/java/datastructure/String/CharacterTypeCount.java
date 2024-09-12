package com.coding.java.datastructure.String;

/**
 * Title : Diverse character
 *
 * Problem Description
 *
 * You are given a character string A having length N.
 *
 * The string consists of 2 types of characters:
 *
 * Alphabets : ['a'-'z', 'A'-'Z']
 * Digits: ['0'-'9']
 * You have to tell the count of characters of the maximum occurring character type.
 *
 */
public class CharacterTypeCount {
    // Function to return the count of the maximum occurring character type
    public static int maxOccurringCharacterTypeCount(String A) {

        int cnta = 0; //count of alphabets
        int cntd = 0; //count of digits

        // Interating over the string
        // cnta will be the frequency of alphabets
        // cntd will be the frequency of digits
        for(int i=0; i < A.length();i++) {

            char ch = A.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                cnta++;
            }
            else if(ch >= 'a' && ch <= 'z') {
                cnta++;
            }
            else if(ch >= '0' && ch <= '9') {
                cntd++;
            }
        }

        if(cnta > cntd) {
            return cnta;
        }
        else {
            return cntd;
        }
    }

    public static void main(String[] args) {
        // Example string A
        String A = "abc123xyz789";

        // Get the count of the maximum occurring character type
        int result = maxOccurringCharacterTypeCount(A);

        // Print the result
        System.out.println("Count of the maximum occurring character type: " + result);
    }
}
