package com.ineuron;

import java.util.Scanner;

public class Fiibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int maxNumber = scanner.nextInt();

		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}

		scanner.close();
	}

}
