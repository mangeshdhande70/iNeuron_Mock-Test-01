package com.ineuron;

import java.util.Scanner;

public class LergestNumber {

	public static void main(String arg[])

	{

		  @SuppressWarnings("resource")
		   Scanner scanner = new Scanner(System.in);

	      int num1 = scanner.nextInt();
	      int num2 = scanner.nextInt();
	      int num3 = scanner.nextInt();

	      if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");

	}
}
