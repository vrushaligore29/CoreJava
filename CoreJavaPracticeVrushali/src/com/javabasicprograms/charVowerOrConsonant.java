package com.javabasicprograms;
import java.util.Scanner;

public class charVowerOrConsonant {

	public static void main(String[] args) {

		System.out.println("Enter any character");
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel");
		} else {
			System.out.println(ch + " is a consonant");
		}
	}
}
