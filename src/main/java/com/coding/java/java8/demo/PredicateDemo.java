package com.coding.java.java8.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<String> predicateObj = (obj)->{
			if(obj instanceof  String){

				if(obj.equals("10")){
					return true;
				}
			}
			return false;
		};

		System.out.println(predicateObj.test("10"));

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Even: " + t));
	}
}
