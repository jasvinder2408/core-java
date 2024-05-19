package com.coding.java.corejava.multithreading;

public class PrintEvenOddByTwoThreads {

	// Starting counter
	private int counter = 1;

	private static int N;

	// Driver Code
	public static void main(String[] args)
	{
		// Given Number N
		N = 10;

		// Create an object of class
		PrintEvenOddByTwoThreads printEvenOddByTwoThreads = new PrintEvenOddByTwoThreads();

		// Create thread t1
//		Thread t1 = new Thread(new Runnable() {
//			public void run()
//			{
//				mt.printEvenNumber();
//			}
//		});
		Thread t1 = new Thread(() -> printEvenOddByTwoThreads.printEvenNumber());

		// Create thread t2
//		Thread t2 = new Thread(new Runnable() {
//			public void run()
//			{
//				mt.printOddNumber();
//			}
//		});
		Thread t2 = new Thread(() -> printEvenOddByTwoThreads.printOddNumber());

		// Start both threads
		t1.start();
		t2.start();
	}

	// Function to print odd numbers
	public void printOddNumber()
	{
		synchronized (this)
		{
			String str="";
			str.split("-");
			// Print number till the N
			while (counter < N) {

				// If count is even then print
				while (counter % 2 == 0) {

					// Exception handle
					try {
						wait();
					}
					catch (
						InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Print the number
				System.out.print(counter + " ");

				// Increment counter
				counter++;

				// Notify to second thread
				notify();
			}
		}
	}

	// Function to print even numbers
	public void printEvenNumber()
	{
		synchronized (this)
		{
			// Print number till the N
			while (counter < N) {

				// If count is odd then print
				while (counter % 2 == 1) {

					// Exception handle
					try {
						wait();
					}
					catch (
						InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Print the number
				System.out.print(
					counter + " ");

				// Increment counter
				counter++;

				// Notify to 2nd thread
				notify();
			}
		}
	}


}
