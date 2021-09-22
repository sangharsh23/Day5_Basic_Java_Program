package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Harmonic_Number {

	public static void main(String[] args) {
		Logic_Builder logic = new Logic_Builder(); 
		System.out.println("Enter harmonic number");
		int number = logic.getIntValue();
     	logic.getHarmonicNumber(number);		
	}
}
