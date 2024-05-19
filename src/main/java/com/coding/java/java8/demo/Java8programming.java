package com.coding.java.java8.demo;

import com.coding.java.DTO.EmployeeDatabase;

import java.util.*;
import java.util.function.Function;
 import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Java8programming {

    public static void main(String [] a){

        String str = "ilovejavatechie";

        Map<String,Integer>m=new HashMap<>();
      List<String> collect1 = m.entrySet().stream()
              .filter(obj -> obj.getValue() > 500)
              .map(obj -> obj.getKey())
              .sorted()
              .collect(Collectors.toList());

      // find occurrence of each character
        Map<String, Long>map= Arrays.stream(str.split(""))
                                    .collect(Collectors.groupingBy(Function.identity(),
                                            Collectors.counting()));


        System.out.println(map);

        // find duplicates
      List<String> duplicateElement = Arrays.stream(str.split(""))
                       . collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet().stream()
               .filter(item-> item.getValue()>1)
               .map(Map.Entry::getKey)
               .collect(Collectors.toList());
      
      


      System.out.println(duplicateElement);

      // find all unique element
        List<String> uniqueElement = stream(str.split(""))
                . collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(item-> item.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(uniqueElement);


        // find first non repeat element
        // use LinkedHashMap to preserve the order
        String firstNonRepeatElement = stream(str.split(""))
                . collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new,Collectors.counting()))
                .entrySet().stream()
                .filter(item-> item.getValue()==1)
                .findFirst().get().getKey();

        System.out.println(firstNonRepeatElement);


        // find avergae salary of employee whose grade is A
      // similar questions:
      //Q) Find sum of salary whose grade is A.
      //Q) Find Max salary of emp whose grade is A.
      double averageSalary=EmployeeDatabase.getEmployees()
                     .stream()
              .filter(emp->emp.getGrade().equals("A"))
              .map(obj->obj.getSalary())
              .mapToDouble(i->i)
              .average()
              .getAsDouble();

      System.out.println("Avg salry of emp whose grade is A = "+ averageSalary);

        int [] numbers= {5,9,11,10,45,22,49, 19};

        Integer secondHighest= stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighest);


        // find longest string from given array
        String [] strArray = {"java", "techie", "hello", "hi"};

        String longestString = stream(strArray)
                                     .reduce((word1, word2)-> word1.length() > word2.length() ? word1 : word2).get();

      System.out.println(longestString);

      // find all element from array start with 1

        ArrayList<String> list = (ArrayList<String>) Arrays.stream(numbers)
                .boxed()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(list);

        // join string : 1-2-3-5-10
        List<String> list2= Arrays.asList("1","2","3","5","10");
        String joinString = String.join("-",list2);

        System.out.println(joinString);


       // find max element
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        // find all even numbers in the list of integers
         myList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);

         // find all duplicates elements
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);

        // find first element
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // find total elemtn
        long count =  myList.stream()
                .count();
        System.out.println(count);


        // sort all values
        myList.stream()
                .sorted()
                .forEach(System.out::println);

        // sort in desc order
      List<Integer> collect = myList.stream()
              .sorted(Collections.reverseOrder()).collect(Collectors.toList());

      System.out.println(collect);


      // List of custom object to Map using stream

//      List<Hosting> list = new ArrayList<>();
//      list.add(new Hosting(1, "liquidweb.com", 80000));
//      list.add(new Hosting(2, "linode.com", 90000));
//      list.add(new Hosting(3, "digitalocean.com", 120000));
//      list.add(new Hosting(4, "aws.amazon.com", 200000));
//      list.add(new Hosting(5, "mkyong.com", 1));
//
//      // key = id, value - websites
//      Map<Integer, String> result1 = list.stream().collect(
//              Collectors.toMap(Hosting::getId, Hosting::getName));
//
//      System.out.println("Result 1 : " + result1);
//
//      // key = name, value - websites
//      Map<String, Long> result2 = list.stream().collect(
//              Collectors.toMap(Hosting::getName, Hosting::getWebsites));
//
//      System.out.println("Result 2 : " + result2);
//
//      // Same with result1, just different syntax
//      // key = id, value = name
//      Map<Integer, String> result3 = list.stream().collect(
//              Collectors.toMap(x -> x.getId(), x -> x.getName()));
//
//      System.out.println("Result 3 : " + result3);
    }
}
