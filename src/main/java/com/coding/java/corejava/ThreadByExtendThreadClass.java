package com.coding.java.corejava;

public class ThreadByExtendThreadClass   {

    public static void main(String [] args){

        MyThread myThread = new MyThread();
        //myThread.run();
        //myThread.run();
        System.out.println(Thread.currentThread().getName());

        myThread.start();
       // myThread.start(); // throws IllegalThreadStateException


        System.out.println(Thread.currentThread().getName());
    }




}


