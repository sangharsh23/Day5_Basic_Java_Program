package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class PowerOfTwo {

	public static void main(String[] args) {
		Logic_Builder logic = new Logic_Builder();
		System.out.println("Enter the number");
		int num = logic.getIntValue();
		logic.power_Of_Two(num);

	}

}
