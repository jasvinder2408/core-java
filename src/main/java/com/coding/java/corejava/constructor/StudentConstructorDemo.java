package com.coding.java.corejava.constructor;

/**
 * Write a program to print the names of students by creating a Student class.
 * If no name is passed while creating an object of Student class, then the name should be "Unknown",
 * otherwise the name should be equal to the String value passed while creating object of Student class.
 */
public class StudentConstructorDemo {

    private String name;


    public String getName(){
        return this.name;
    }
    public StudentConstructorDemo(String name){
        this.name = name;
    }

    public StudentConstructorDemo(){
        this.name = "Unknown";
    }


    public  static void main(String [] args){

        StudentConstructorDemo studentConstructorDemo1 = new StudentConstructorDemo("Monu");

        System.out.println(studentConstructorDemo1.getName());


        StudentConstructorDemo studentConstructorDemo2 = new StudentConstructorDemo();

        System.out.println(studentConstructorDemo2.getName());
    }



}
