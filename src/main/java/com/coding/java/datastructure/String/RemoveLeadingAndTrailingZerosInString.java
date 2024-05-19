package com.coding.java.datastructure.String;

public class RemoveLeadingAndTrailingZerosInString {
    public static void main(String[] args) {
        String str= "000 1020334501 00000";

        System.out.println(removeLeadingAndTrailingZeros(str));

    }

    private static String removeLeadingAndTrailingZeros(String str){

        String strNew = removeLeadingZeroes(str);

        return removeTrailingZeroes(strNew);
    }

    private static String removeLeadingZeroes(String s) {
        int index;
        for (index = 0; index < s.length(); index++) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        return s.substring(index);
    }

    private static String removeTrailingZeroes(String s) {
        int index;
        for (index = s.length() - 1; index >= 0; index--) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        return s.substring(0, index + 1);
    }
}
