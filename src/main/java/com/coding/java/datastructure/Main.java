package com.coding.java.datastructure;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int initialNumber = num;
        int newNumber=0;

        while(num > 0){

            newNumber = newNumber * 10 + num % 10;

            num = num / 10;
        }

        if(initialNumber == newNumber){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}