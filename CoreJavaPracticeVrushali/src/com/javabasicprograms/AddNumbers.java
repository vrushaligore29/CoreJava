package com.javabasicprograms;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {

		
		int sum;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
		
		System.out.println("Enter value of b");
		int b=s.nextInt();
		
		sum = a + b;

		System.out.println("Sum of a and b is=" + sum);
	}
}
