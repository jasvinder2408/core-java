package com.coding.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public void m1(double d){

        System.out.println("double type printed "+d);

    }

    public void m1(float d){

        System.out.println("float type printed "+d);

    }

    public void m1(long d){

        System.out.println("Long type printed "+d);

    }

    public void m1(int d){

        System.out.println("int type printed "+d);

    }


    public static void main(String [] args){

        new Test().m1(10);
        new Test().m1(1.2);




        FuncInterfaceDemo funcInterfaceDemo = (s)->{
            return "Hello this is "+ s;
        };

        System.out.println(funcInterfaceDemo.printName("java 8"));

    }

}
