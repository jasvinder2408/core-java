package com.coding.java.corejava.interfaceAndAbstractClass;

/**
 * Write a Java program to create an abstract class BankAccount with abstract methods
 * deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend
 * the BankAccount class and implement the respective methods to handle deposits and withdrawals
 * for each account type.
 */
// Driver class
public class AbstractClassDemo {

    public static void main(String [] args){

       // BankAccount bankAccount1 = new SavingsAccount(); // polymorphism

        BankAccountI bankAccount1 = new SavingsAccount(); // polymorphism

       // bankAccount1.printName("SavingsAccount");

        System.out.println("===========================================");
        bankAccount1.deposit(1000);
        bankAccount1.withdraw();


        System.out.println("");

        BankAccountI bankAccount2 = new CurrentAccount(); // polymorphism

       // bankAccount1.printName("CurrentAccount");
        System.out.println("===========================================");

        bankAccount2.deposit(10000);
        bankAccount2.withdraw();
    }
}
