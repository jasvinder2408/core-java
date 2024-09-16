package com.coding.java.datastructure.scaler.Array1D.refresher;

import java.util.Scanner;

public class DivisibilityByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number N
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        
        // Check if N is divisible by 5
        if (N % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
        
        scanner.close();
    }
}
