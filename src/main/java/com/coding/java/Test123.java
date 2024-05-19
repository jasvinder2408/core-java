package com.coding.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test123 {

    private static boolean isAnagram(String str1, String str2){

        String [] strArray1= str1.split("");
        String [] strArray2= str2.split("");
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        return strArray1.equals(strArray2);

    }


    public static void main(String[] args) {


        String str1= "silent";
        String str2 = "listen";

        System.out.println(isAnagram(str1,str2));

    }
}
