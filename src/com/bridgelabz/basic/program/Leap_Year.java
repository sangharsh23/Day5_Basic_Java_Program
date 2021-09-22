package com.bridgelabz.basic.program;

import com.bridgelabz.logic.builder.Logic_Builder;

public class Leap_Year {

	public static void main(String[] args) {
		Logic_Builder logic=new Logic_Builder();
        System.out.println("Enter the year :");
        int year = logic.getIntValue();
        logic.leapYear(year);
	}

}
