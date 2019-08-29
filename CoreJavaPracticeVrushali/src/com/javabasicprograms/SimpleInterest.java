package com.javabasicprograms;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter principal");
		float p = s.nextFloat();

		System.out.println("Enter Time Period");
		float n = s.nextFloat();

		System.out.println("Enter Rate of Interest");
		float r = s.nextFloat();

		float si = p * n * r / 100;

		System.out.println("Simple Interest is " + si);

	}

}
