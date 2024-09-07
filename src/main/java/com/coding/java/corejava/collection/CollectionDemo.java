package com.coding.java.corejava.collection;

import java.util.ArrayList;

/**
 * Collection: group of object stored in an entity which is known as Collection.
 */
public class CollectionDemo {

    public static void main(String [] args){

        String str1 = new String("Monu");
        String str2 = "Monu";

        int a = 10;
        int b = 20;

        int [] arrayValue= {10,20,30,40,50};   // primitive  ==> Homo-geneous


        ArrayList arrayList = new ArrayList();  //store different kinds of object => Hetero-generous

        arrayList.add("Hello");
        arrayList.add(10);
        arrayList.add(10d);
        arrayList.add(10f);


        ArrayList<Integer> arrayListInteger = new ArrayList<>();  // generic => type safety
        arrayListInteger.add(40);


    }
}
