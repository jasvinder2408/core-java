package com.coding.java.designpattern.immutable;

public final class ImmutableClass {

    private int i;

    ImmutableClass(int i){
        this.i = i;
    }

    public ImmutableClass modify(int i){

        if(this.i == i){
            return this;
        }
        else {
            return new ImmutableClass(i);
        }
    }

    public static void main(String [] args){

        ImmutableClass obj1 = new ImmutableClass(10);

        ImmutableClass obj2=  obj1.modify(100);
        ImmutableClass obj3=  obj1.modify(10);

        System.out.println(obj1==obj2);
        System.out.println(obj1==obj3);




    }
}
