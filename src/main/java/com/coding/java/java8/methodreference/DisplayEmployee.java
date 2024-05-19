package com.coding.java.java8.methodreference;

import com.coding.java.java8.map_reduce.Employee;

public class DisplayEmployee {
    static int i=1;

    public DisplayEmployee(Employee employee) {
        System.out.println("Inside constructor" + employee);

    }
    public DisplayEmployee(){

    }

    public static void print(Employee employee){
        System.out.println(i++);
        System.out.println(employee);
    }

    public void increaseSalary(Employee employee){
        System.out.println(employee.getSalary()+1000);
    }
}
