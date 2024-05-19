package com.coding.java.designpattern.singleton;

public class MultiThreadedLazySingletonPattern {

    private static MultiThreadedLazySingletonPattern instance =null;

    private MultiThreadedLazySingletonPattern(){

    }

    public MultiThreadedLazySingletonPattern getInstance(){

        if (instance == null){

            synchronized (MultiThreadedLazySingletonPattern.class){

                if(instance==null){

                    instance= new MultiThreadedLazySingletonPattern();

                }
            }

        }
        return instance;

    }
}
