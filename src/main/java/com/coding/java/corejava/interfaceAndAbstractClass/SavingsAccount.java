package com.coding.java.corejava.interfaceAndAbstractClass;

public class SavingsAccount implements BankAccountI {
        //extends BankAccount{

    @Override
    public void deposit(int amount) {

        System.out.println("SavingsAccount - Amount deposited : " + amount);
    }

    @Override
    public int withdraw() {

        System.out.println("SavingsAccount - Amount withdraw : " + 100);

        return 10;
    }
}
