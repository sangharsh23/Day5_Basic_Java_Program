package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Prime_Factor {

	public static void main(String[] args) {
		Logic_Builder logic = new Logic_Builder();
        System.out.println("Enter the number ");
        int number = logic.getIntValue();
        logic.getPrimeFactor(number);
	}

}
