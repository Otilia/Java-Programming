package bookOfWu;

/* Problem 22 page 79
 * An introduction to Object-Oriented Programming with Java
 * by C. Thomas Wu
 */

import javax.swing.*;
import java.util.*;

class CustomizedWindow {

	public static void main(String[] args) {
		String title;
		int W, H;
		Scanner scanner = new Scanner(System.in);	
		JFrame myWindow;
		myWindow = new JFrame();
		
		System.out.print("Enter the width of the window, W = ");
		W = Integer.parseInt(scanner.next());
		
		System.out.print("Enter the height of the window, H = ");
		H = Integer.parseInt(scanner.next());
		
		myWindow.setSize(W, H);
		
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Enter a title for your window: ");
		title = scanner.next();
		
		myWindow.setTitle(title);
		
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scanner.close();
	}

}
