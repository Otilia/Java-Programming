package bookOfWu;

/* 
 * Problem 21 page 79
 * "An Introduction to Object-Oriented Programming with Java"
 * by C. Thomas Wu
 */

import java.util.*; //for Date
import java.text.*; //for SimpleDateFormat
class DateToday {

	public static void main(String[] args) {
		Date				today;
		SimpleDateFormat	sdf;
		
		today = new Date();
		sdf = new SimpleDateFormat("EEEE MMMM dd YYYY");
		
		System.out.println(sdf.format(today));
	}

}
