package com.coding.java.designpattern.singleton;

public class LazySingletonPattern {

    private static LazySingletonPattern instance= null;


    private LazySingletonPattern(){

    }

    public LazySingletonPattern getInstance(){

        if(instance==null){
            instance = new LazySingletonPattern();
        }
        return instance;
    }
}
