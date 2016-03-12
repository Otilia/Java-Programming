package bookOfWu;

/* 
 * Chapter 2 Sample Program: Displays Formatted Data Information
 * File: Ch2DateDisplay.java
 */

import java.util.*; //for Date
import java.text.*; //for SimpleDateFormat
public class Ch2DateDisplay {

	public static void main(String[] args) {
		Date				today;
		SimpleDateFormat	simpleDF1, simpleDF2;
		
		today = new Date();
		simpleDF1 = new SimpleDateFormat();
		simpleDF2 = new SimpleDateFormat(" EEEE, dd MMMM YYYY");
		
		//Default short format display
		System.out.println("Today is " + simpleDF1.format(today));
		
		//Programmer-designated long format display
		System.out.println("Today is " + simpleDF2.format(today));
	}

}
