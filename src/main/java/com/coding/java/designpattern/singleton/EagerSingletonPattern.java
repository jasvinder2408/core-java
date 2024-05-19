package com.coding.java.designpattern.singleton;

// this resolve issue with multi threaded env but if object is not using it waste the memory
public class EagerSingletonPattern {

    private static EagerSingletonPattern instance = new EagerSingletonPattern();

    private EagerSingletonPattern(){

    }

    public EagerSingletonPattern getInstance(){
        return instance;
    }
}
