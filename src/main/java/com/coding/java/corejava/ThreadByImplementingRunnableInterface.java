package com.coding.java.corejava;

public class ThreadByImplementingRunnableInterface {

    public static void main(String [] args){
        MyThread2 myThread2 = new MyThread2();
        Thread t = new Thread( myThread2);
        t.start();
    }
 }
