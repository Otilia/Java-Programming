package bookOfWu;

/* 
 * Problem 20 page 79
 * "An Introduction to Object-Oriented Programming with Java"
 * by C. Thomas Wu
 */

import java.util.*; //for Date
import java.text.*; //for SimpleDateFormat
class Today {

	public static void main(String[] args) {
		Date				today;
		SimpleDateFormat	sdf;
		
		today = new Date();
		sdf = new SimpleDateFormat("dd MMMM yyyy");
		
		System.out.println(sdf.format(today));
	}

}
