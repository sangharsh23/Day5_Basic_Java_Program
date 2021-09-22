package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;



public class FilpCoin {
	public static void main(String[] args) {
		Logic_Builder logic=new Logic_Builder();
		System.out.println("Enter the value how many time coin flip : ");
		int numberOfFlips = logic.getIntValue();
        logic.FilpCoinPercentage(numberOfFlips);
	}

}
