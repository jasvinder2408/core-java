package com.coding.java.corejava.interfaceAndAbstractClass;

public class CurrentAccount implements BankAccountI{
        //extends BankAccount {

    @Override
    public void deposit(int amount) {

        System.out.println("CurrentAccount - Amount deposited : " + amount);
    }

    @Override
    public int withdraw() {

        System.out.println("CurrentAccount - Amount withdraw : " + 10);

        return 10;
    }
}
