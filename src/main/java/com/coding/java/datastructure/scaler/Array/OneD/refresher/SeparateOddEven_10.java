package com.coding.java.datastructure.scaler.Array.OneD.refresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateOddEven_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Loop over each test case
        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int n = sc.nextInt();
            
            // Initialize lists to hold even and odd elements
            List<Integer> evenList = new ArrayList<>();
            List<Integer> oddList = new ArrayList<>();

            // Read the array elements and categorize them
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenList.add(num);
                } else {
                    oddList.add(num);
                }
            }

            // Print the odd elements first, maintaining the original order
            for (int odd : oddList) {
                System.out.print(odd + " ");
            }
            System.out.println();

            // Print the even elements, maintaining the original order
            for (int even : evenList) {
                System.out.print(even + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
