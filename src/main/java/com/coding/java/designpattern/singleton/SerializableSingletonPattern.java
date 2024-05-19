package com.coding.java.designpattern.singleton;

public class SerializableSingletonPattern {

    private static SerializableSingletonPattern instance ;


    private SerializableSingletonPattern(){

    }

    public SerializableSingletonPattern getInstance(){

        if(instance==null){
            instance = new SerializableSingletonPattern();
        }
        return instance;
    }

    /**
     * this method gets invoked during de-serialization of object
     * and here we simply return the same instance.
     * @return
     */
    protected Object readResolve(){
        return instance;
    }
}
