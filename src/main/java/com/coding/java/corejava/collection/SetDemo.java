package com.coding.java.corejava.collection;

import com.coding.java.java8.map_reduce.Employee;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Employee> setOfEmployee= new HashSet<>();

        setOfEmployee.add(new Employee(1,"test","A",1));
        setOfEmployee.add(new Employee(1,"test","A",1));

        System.out.println(setOfEmployee.size()); // O/p = 2 , iff equals and hashCode method dont override
        System.out.println(setOfEmployee.size()); // O/p = 1 , when override

    }
}
