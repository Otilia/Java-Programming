package bookOfWu;

/* Problem 19 page 79
 * An introduction to Object-Oriented Programming with Java
 * by C. Thomas Wu
 */

import java.util.*;

class Names {

	public static void main(String[] args) {
		String first, middle, last;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		first = scanner.next();
		System.out.print("Enter middle name: ");
		middle = scanner.next();
		System.out.print("Enter last name: ");
		last = scanner.next();
		System.out.println("The name is " + first + " " + middle.substring(0,1) + ". " + last+ ".");
		scanner.close();
	}

}
