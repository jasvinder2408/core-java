package com.coding.java.datastructure.scaler.ArrayList;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void basicOperation() {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      //print ArrayList
      System.out.println(arr);

      // add
      arr.add(2);
      arr.add(-1);
      arr.add(5);
      System.out.println(arr);

      //get
      System.out.println("1st index in the array is " + arr.get(1));
      //System.out.println("1st index in the array is " + arr.get(3));
      //System.out.println("1st index in the array is " + arr.get(-1));

      //size
      System.out.println("size of the array is " + arr.size());

      //remove
      arr.remove(1);
      System.out.println(arr);

      //set
      arr.set(1,8);
      System.out.println(arr);
  }
  //Q1. Taking a arraylist as input 
  public static ArrayList<Integer> readArrayList() {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 0 ; i<n; i++) {
      arr.add(scn.nextInt());
    }
    return arr;
  }

  //Q2. Given an ArrayList, return an Arraylist of
  // the multiples of 5 or 7.
  //input: [1,5,3,0,7,10]
  //output: [5,0,7,10]
  public static ArrayList<Integer> filterMultiples5or7(ArrayList<Integer> arr) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i =0 ; i < arr.size(); i++) {
      int val = arr.get(i);
      if(val%5==0 || val%7==0) ans.add(val);
    }
    return ans;
  }

  //Q3. Given two integers A and B as input. 
  // return an Arraylist containing first B multiples of A.
  // input: A=2, B=4
  // output: [2,4,6,8]
  public static ArrayList<Integer> getBMultiplesOfA(Integer A, Integer B) {
    // B multiples of A
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i = 1; i <=B ; i++) {
      // add ith multiple of A in the ArrayList
      ans.add(i*A);
    }
    return ans;
  }

  //2D ArrayList Playgroud
  public static ArrayList< ArrayList<Integer> > twoDArrayList() {
    //Syntax
    //ArrayList<Type> arr = new ArrayList<Type>();
    ArrayList< ArrayList<Integer> > arr = new ArrayList< ArrayList<Integer> >();

    ArrayList<Integer> row1 = new ArrayList<Integer>();
    row1.add(1);
    row1.add(4);
    arr.add(row1);

    ArrayList<Integer> row2 = new ArrayList<Integer>();
    row2.add(0);
    arr.add(row2);

    ArrayList<Integer> row3 = new ArrayList<Integer>();
    row3.add(10);
    row3.add(-5);
    row3.add(1);
    arr.add(row3);

    //System.out.println(arr);
    //Get
    //System.out.println("first row is " + arr.get(0));
    //System.out.println("first row first column is " + arr.get(0).get(0));

    //size 
    //System.out.println("no of rows are " + arr.size());

    // remove row3
    arr.remove(2);
    //System.out.println(arr);

    // set 
    arr.set(0, row3);
    //System.out.println(arr);

    //update 2nd index of 0th row
    ArrayList<Integer> temp = arr.get(0);
    temp.set(2, 10);
    arr.set(0,temp);

    arr.add(row1);

    return arr;
  }

  //Q4 Given a 2D Arraylist, print each row line by line.
  //input: [[1, 4], [0], [10, -5, 1]]
  /**output: 1 4
             0
             10 -5 1
  **/
  public static void printRowByRow(ArrayList< ArrayList<Integer> > arr) {
    int numberofrows = arr.size();
    for(int i = 0; i< numberofrows; i++) {
      //print ith row
      int numofCols = arr.get(i).size();
      for(int j = 0; j< numofCols; j++) {
        System.out.print(arr.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }

  //Q5. Given an integer N as input. return the numeric staircase
  //input: 3
  /**
        [1]
        [1,2]
        [1,2,3]
  **/
  public static void printStaircase(int n) {
    //ArrayList< ArrayList<Integer> > ans = new ArrayList< ArrayList<Integer> >();

    // for(int i = 1; i<=n; i++) {
    //   //insert ith row in ans (2D array)
    //   // ith row contains i elements
    //   // 1 2 3 4 5 ...... i
    //   ArrayList<Integer> rowI = new ArrayList<Integer>();
    //   for(int j = 1; j<=i ; j++) rowI.add(j);

    //   ans.add(rowI);
    //   System.out.println(rowI);
    // }
    //System.out.println(ans);

    ArrayList<Integer> ans = new ArrayList<Integer>();
    for(int i = 1; i<=n; i++) {
      ans.add(i);
      System.out.println(ans);
    }
    //System.out.println(ans);
  }

  public static void main(String[] args) {
      //ArrayList<Integer> arr = readArrayList();

      // ArrayList<Integer> ansQ2 = filterMultiples5or7(arr);
      //System.out.println(ansQ2);
      
      // Scanner scn = new Scanner(System.in);
      // int a = scn.nextInt(); 
      // int b = scn.nextInt();
      // ArrayList<Integer> ansQ3 = getBMultiplesOfA(a,b);
      // System.out.println(ansQ3);

      // ArrayList< ArrayList<Integer> > arr = twoDArrayList();
      // System.out.println(arr);
      // printRowByRow(arr);

      // Scanner scn = new Scanner(System.in);
      // int n = scn.nextInt(); 
      // printStaircase(n);

      // use Java 8 oracle JDK - Language
  }
}