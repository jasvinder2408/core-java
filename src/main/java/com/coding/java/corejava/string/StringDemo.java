package com.coding.java.corejava.string;

public class StringDemo {

    public static void main(String[] args) {

        String str1= new String("hello");

        String str2 = new String("hello");

        System.out.println(str1 == str2);

        String str3= str1;

        System.out.println(str1 == str3);

       // str2.intern();

        String str4= "hello";

        String str5= "hello";

        System.out.println(str4 == str5);

    }
}
