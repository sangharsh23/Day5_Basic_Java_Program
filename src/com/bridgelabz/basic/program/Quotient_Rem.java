package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Quotient_Rem {

	public static void main(String[] args) {
		Logic_Builder logic=new Logic_Builder();
		
		System.out.println("Enter the divisior value : ");
		int quotient = logic.getIntValue();	
		System.out.println("Enter the dividend value : ");
		int remainder = logic.getIntValue();
		logic.quotient_Rem(quotient,remainder);
	

	}

}
