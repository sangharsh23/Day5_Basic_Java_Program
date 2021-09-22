package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Swap_Two_Number {

	public static void main(String[] args) {
		Logic_Builder logic =new Logic_Builder();
		System.out.println("Enter the number1 before swaping :");
		int number1 = logic.getIntValue();
		System.out.println("Enter the number2 before swaping :");
		int number2 = logic.getIntValue();
		logic.swap_Two_Number(number1, number2);

	}

}
