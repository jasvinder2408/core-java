package com.coding.java.datastructure.scaler.HashMapAndSet;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Countries with population less than K
 *
 * Problem Description
 * You are given a Hashmap<String, int> H and an integer K as a function input.
 *
 * The hashmap stores the name of some countries and the corresponding population.
 *
 * Return the number of countries with a population less than K.
 *
 *
 * Steps:
 * Iterate over the entries of the HashMap: We'll loop through the key-value pairs in the map where the key represents the country's name and the value represents its population.
 * Compare the population to K: For each country, if its population is less than K, we increment the count.
 * Return the count: Once we have finished iterating, return the count of countries with populations less than K.
 */
public class PopulationCounter {
    public static int countCountriesWithPopulationLessThanK(HashMap<String, Integer> H, int K) {
        int count = 0;

        // Step 1: Iterate over the entries of the HashMap
        for (Map.Entry<String,Integer> mapElement : H.entrySet()) {
            // Step 2: Compare each population with K
            if(mapElement.getValue() < K){
                count++;
            }
        }

        // Step 3: Return the count of countries
        return count;
    }
    
    public static void main(String[] args) {
        // Example HashMap of countries and populations
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("CountryA", 500000);
        countryPopulation.put("CountryB", 1200000);
        countryPopulation.put("CountryC", 800000);
        countryPopulation.put("CountryD", 400000);
        
        int K = 1000000;
        int result = countCountriesWithPopulationLessThanK(countryPopulation, K);
        
        System.out.println(result);  // Output: 3 (CountryA, CountryC, and CountryD have populations less than 1 million)
    }
}
