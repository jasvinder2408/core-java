package com.coding.java.corejava.interfaceAndAbstractClass;

public abstract class BankAccount {

  //  private String name;

    public abstract void deposit(int amount);

    public abstract int withdraw();

    public void printName(String str) {   // concrete method or method having the definition

        System.out.println("Bank Account is : " + str);
    }

//    public BankAccount(String name){
//        this.name = name;
//    }
}

