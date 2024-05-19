package com.coding.java.corejava.interfaceAndAbstractClass;

public interface BankAccountI {

    void deposit(int amount);
    int withdraw();

//    public void printName(String str) {   // concrete method are not allowed in the interface as per definition.
//        System.out.println("Bank Account is : " + str);
//    }
}
