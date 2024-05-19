package com.coding.java.corejava;/* Online Java Compiler and Editor */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld{

   public static void main(String[] args) {
         
        System.out.println( findOccurrence("hello"));
         
    }
    
    private static Object findOccurrence(String str){
        
       return Arrays.stream(str.split(""))
              .collect(Collectors.groupingBy(
                  Function.identity(),
                  Collectors.counting()
                  ))
                  .entrySet().stream()
               .filter(obj->obj.getValue()>1)
               .collect(Collectors.toList());

        
        
        
    }
}