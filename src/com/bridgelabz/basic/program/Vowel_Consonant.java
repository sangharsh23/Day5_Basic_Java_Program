package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Vowel_Consonant {

	public static void main(String[] args) {
		Logic_Builder logic= new Logic_Builder();
		System.out.println("Enter the alphabet");
		char alphabet = logic.getCharValue();
		logic.getVowelConsonant(alphabet);
		

	}

}
