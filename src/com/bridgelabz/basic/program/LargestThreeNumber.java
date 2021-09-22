package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class LargestThreeNumber {

	public static void main(String[] args) {
		Logic_Builder logic = new Logic_Builder();
		System.out.println("Enter number1 ");
        int number1 = logic.getIntValue();
        System.out.println("Enter number2");
        int number2 = logic.getIntValue();
        System.out.println("Enter number3");
        int number3 = logic.getIntValue();
        logic.getLargestNumber(number1, number2, number3);
	}

}
