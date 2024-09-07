package com.coding.java.corejava.javaLang;

public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }




    public String toString(){

        return "name = " + this.name + "\n"+"Roll no = " +this.rollNo;

        // return getClass().getName() + "@" + Integer.toHexString(hashCode()); --> Object class return string in this format.
    }

    public static void main(String [] args){

        Student student1 = new Student("Monu", 12);

        Student student2 = new Student("Monu", 12);


        System.out.println(student1);


        StringBuffer stringBuffer = new StringBuffer("hi");





    }
}
