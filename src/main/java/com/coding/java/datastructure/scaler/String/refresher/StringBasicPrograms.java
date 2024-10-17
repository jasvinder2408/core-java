package com.coding.java.datastructure.scaler.String.refresher;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class StringBasicPrograms {
  // String country = "India";
  // Assume it as array country = ['I', 'n', 'd', 'i', 'a'];
  // country.length() 
  // country.charAt(2) //d is the output
  // country.charAt(0) //I is the output

  //ASCII - 128 characters. Mapping characters to numbers (0 to 127)

  //Q1. Given a String, print it's characters in new line
  //input: "India"
  /**output:I
            n
            d
            i
            a
  **/

  public static void printStringChars(String s) {
    int n = s.length();

    for( int i = 0; i < n; i++) {

      char c = s.charAt(i);
      System.out.println(c);
    }
  }

  //Q2. Given a string, print the ASCII values of 
  // it's characters (each in new line)
  //input: India
  /** output: 73
              110
              100
              105
              97
  **/
  public static void printStringASCII(String s) {
    int n = s.length();
    for(int i = 0 ; i < n ; i++) {
      //M-1
      // char c = s.charAt(i);
      // int x = s.charAt(i);
      // System.out.println(x);

      //M-2
      // char c = s.charAt(i);
      // System.out.println((int)c);

      //M-3
      System.out.println((int)s.charAt(i));
    }
  }

  // Q3. Given a string, print the count of the upper-case characters.
  // input: "kjRS78q31@3 Q"
  // output: 3

  //ASCII is between 65 to 90
  public static void printUppercaseCount(String s) {
    int n = s.length();
    int cnt = 0;

    //M-1
    // for(int i = 0 ; i < n ; i++) {
    //   int ascii = s.charAt(i);
    //   if(ascii >=65 && ascii <=90) cnt++;
    // }

    //M-2
    for(int i = 0 ; i < n ; i++) {
      char c = s.charAt(i);
      if(c >='A' && c <='Z') cnt++;
    }
    System.out.print(cnt);
  }

  //Q4. Given a string, print the count of special characters
  // (Everything - Uppercase - lowercase - digits)

  //input: "kjRS78q31@3 Q"
  //output: 2

  public static void printSpecialCharCount(String s) {
    int n = s.length();
    int cnt = 0;
    for(int i = 0 ; i < n ; i++) {
      char c = s.charAt(i);
      if(c>='A' && c<='Z') continue;
      if(c>='a' && c<='z') continue;
      if(c>='0' && c<='9') continue;
      cnt++;
    }
    System.out.println(cnt);
  
  }

  //Q5. Given a string, return the string in reverse
  // (don't just print it, build a string in reverse)
  // (don't just any direct of reversing string as well)

  //input: Vimalji
  //output: ijlamiV
  public static String reverseString(String s) { 
    // "in" + "dia" -> "india"
    int n = s.length();
    String ans = "";
    //M-1
    // for(int i =0; i<n;i++) {
    //   char c = s.charAt(i);
    //   ans = c + ans;
    // } 

    // s = hello
    //M-2 
    for(int i = n-1; i>=0 ; i--) {
      char c = s.charAt(i);
      ans = ans + c; 
    }
    return ans;
  }

  //Q6. Given a string. Check if it is palindrome or not.
  // Palindrome: Palindronme is a string, which spells same from the front and back
  // Exmaple: madam, maam, dad,  oppo, mom, nitin, malayalam, racecar

  //input: madam
  //output: true

  //input: Sir
  //output: false

  public static boolean isPalindrome(String s) {
    String reverse = reverseString(s);
    return s.equals(reverse);
  }
  public static void main(String[] args) {
    //printStringChars("India");

    Scanner scn = new Scanner(System.in);
    // String s = scn.nextLine();
    // printStringChars(s);

    //printStringASCII("India");

    //printUppercaseCount("kjRS78q31@3 Q");

    //printSpecialCharCount("kjRS78q31@3 Q");

    //System.out.println(reverseString("India"));

    System.out.println(isPalindrome("madam"));
    System.out.println(isPalindrome("sir"));
  }
}