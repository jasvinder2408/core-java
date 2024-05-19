package com.coding.java.java8.methodreference;

import com.coding.java.DTO.EmployeeDatabase;
import com.coding.java.java8.map_reduce.Employee;
import java.util.stream.Collectors;

public class MethodReferenceDemo {


    public static void main(String[] args) {

       // Reference to static method
        EmployeeDatabase.getEmployees()
                .stream().filter(emp-> emp.getGrade().equals("A"))
                .collect(Collectors.toList())
                //.forEach(System.out::println);
                .forEach(DisplayEmployee :: print);



        DisplayEmployee displayEmployee = new DisplayEmployee();

        // Reference to instance method
        EmployeeDatabase.getEmployees()
                .stream().filter(emp-> emp.getGrade().equals("A"))
                .collect(Collectors.toList())
                //.forEach(System.out::println);
                .forEach(displayEmployee :: increaseSalary);



        // reference constructor
        EmployeeDatabase.getEmployees()
                .stream().filter(emp-> emp.getGrade().equals("A"))
                .collect(Collectors.toList())
                 .forEach(DisplayEmployee :: new);


       // getName is not static, its calling with Class Name as it doesn't take any argument
        // so, it treats as static method
        EmployeeDatabase.getEmployees()
                .stream()
                .map(Employee::getName)
                .forEach(System.out:: println);
    }
}
