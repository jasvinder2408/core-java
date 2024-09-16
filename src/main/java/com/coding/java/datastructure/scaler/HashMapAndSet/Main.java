package com.coding.java.datastructure.scaler.HashMapAndSet;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
  public static void practiceSyntax() {
      HashSet<Integer> hs = new HashSet<Integer>();

      System.out.println(hs);

      hs.add(100);
      hs.add(3);
      hs.add(-2);
      hs.add(10);
      hs.add(3);
      hs.add(10);
      hs.add(1);
      hs.add(-50);

      System.out.println(hs);

      hs.remove(3);
      System.out.println(hs);
      System.out.println("Size of the hashset is " + hs.size());
      System.out.println("Element 100 is present " + hs.contains(100));
      System.out.println("Element 0 is present " + hs.contains(0));

  }

  public static void practiceHashMap() {
    HashMap<String, Integer> hm = new HashMap<String, Integer>();

    hm.put("Delhi", 18);
    hm.put("Punjab", 20);
    hm.put("Haryana", 18);
    System.out.println(hm);

    System.out.println("Gujarat is present " + hm.containsKey("Gujarat"));
    System.out.println("Delhi is present " + hm.containsKey("Delhi"));

    System.out.println("Delhi population is " + hm.get("Delhi"));
    System.out.println("Size of hashmap is " + hm.size());

    hm.remove("Delhi");
    System.out.println(hm);

    //get all keys
    // hm.keySet();
    System.out.println(hm.keySet());
    //System.out.println(hm.values());

    for(String i :  hm.keySet()) {
      System.out.println(i + " population is " + hm.get(i));
    }
    // HashMap<String, HashMap<String, Integer> > hmm = new HashMap<String, HashMap<String, Integer>>();
    // hmm.put("India",hm );
    // System.out.println(hmm);
  }
  //Q1. Given an integer array. add its elements in HashSet
  // and return the HashSet.
  public static HashSet<Integer> covertArrayToHashSet(int[] arr) {
    HashSet<Integer> hs = new HashSet<Integer>();
    for(int i = 0 ; i< arr.length ; i++ ) {
      hs.add(arr[i]);
    }
    return hs;
  }

  //Q2. Given 2 hashset as input, print their
  // common elements.
  //input: hs1= {0,-2,4,10}
  //       hs2= {1,-2,3,4,5} 
  //output: -2,4

  public static void printCommonElements(HashSet<Integer> h1, HashSet<Integer> h2) {
    for(Integer i : h1) {
      if(h2.contains(i)) System.out.print(i + " ");
    }
    return;
  }

  //Q3. Given an integer array as input. Print the frquency map.
  //input: [1,4,3,-2,1,1,4,5,3]
  /** 
      {1=3, 4=2, 3=2, -2=1, 5=1 }
  **/
  public static void printFrequencyMap(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i =0 ; i <arr.length; i++) {
      // arr[i]
      if(hm.containsKey(arr[i]) == false) {
        //first time seeing this element
        hm.put(arr[i],1);
      } else {
        //Repeated element, we should update the value
        hm.put(arr[i], hm.get(arr[i])+1);
      }
    }
    System.out.println(hm);

    /**[1,4,3,-2,1,1,4,5,3]

    {1:3, 4:2, 3:2, -2:1, 5:1 }

    **/
  }
  public static void main(String[] args) {
      /** Arraylist 
              -Sequential order
              - Duplictaes allowed

          HashSet
              - Sequence not maintained
              - Unique elements present only.
      **/

    //Ans1 
    // int arr[] = {1,4,3,-2,1,1,4,5,3};
    // System.out.println(covertArrayToHashSet(arr));
    // int arr1[] = {-3,1,2,3};
    // int arr2[] = {-3,1,5,6,7};
    // HashSet<Integer> h1 = covertArrayToHashSet(arr1);
    // HashSet<Integer> h2 = covertArrayToHashSet(arr2);
    // printCommonElements(h1,h2);

    
    //BREAK
    // 10:12-10:21

    //int ->Integer
    //long -> Long
    //float -> float
    //practiceHashMap();
    int[] arr = {1,4,3,-2,1,1,4,5,3};
    printFrequencyMap(arr);
  }
}