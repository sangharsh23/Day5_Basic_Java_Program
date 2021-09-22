
package com.bridgelabz.logic.builder;

import java.util.Scanner;

public class Logic_Builder {

	Scanner input;

	public Logic_Builder() {
		input = new Scanner(System.in);
	}

	public int getIntValue() {
		return input.nextInt();
	}

	public char getCharValue() {
		return input.next().charAt(0);
	}
  //1) program to find flip coin percentage
	public void FilpCoinPercentage(int numberOfFlips) {
		double head = 0, headPercentage = 0;
		for (int i = 0; i < numberOfFlips; i++) {
			double side = Math.random();
			if (side > 0.5) {
				head++;
			}
			headPercentage = head * 100 / numberOfFlips;
			System.out.println("Percentage of Head = " + headPercentage);
			System.out.println("Percentage of Tail = " + (100 - headPercentage) + "\n");
		}
	}

	//2) program to find Nth harmonic number 
	public void getHarmonicNumber(int number) {
		double sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1 / i);
		}
		System.out.println("n'th harmonic number of " + number + "" + sum);
	}

	// 3) program to find leap year 
	public void leapYear(int year) {
		if (year % 4 == 0 && year % 400 == 0 || year % 100 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap year");
		}
	}

	//4) program to find  power of two 
	public void power_Of_Two(int number) {
		for (double i = number; i <= 31; i++) {
			int num = (int) Math.pow(number, i);
			System.out.println(num);
		}
	}

	//5) program to find quotient and remainder 
	public void quotient_Rem(int dividend, int divisior) {
		int quotient = dividend / divisior;
		System.out.println("Quotient = " + quotient);
		int remainder = dividend % divisior;
		System.out.println("Remainder = " + remainder);
	}

	// 6) program find the number are even or odd
	public void even_Odd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("odd");
		}
	}

	//7) program to swap two number 
	public void swap_Two_Number(int number1, int number2) {
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("Number1 value After swapping : " + number1);
		System.out.println("Number2 value After Swapping : " + number2);
	}

	//8) program to check whether alphabet is vowel or consonant
	public void getVowelConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
	}

// 9) program find prime factor of any number
	public void getPrimeFactor(int number) {
		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i + "");
				number = number / i;
			}
		}
		if (number > 2) {
			System.out.println(number);
		}
	}

//10) program to find largest among three number 
	public void getLargestNumber(int number1, int number2, int number3) {
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1 + " is largest number");
		} else if (number2 > number1 && number2 > number3) {
			System.out.println( number2 +" is largest number");
		} else {
			System.out.println( number3 + " is largest number ");
		}

	}
}
