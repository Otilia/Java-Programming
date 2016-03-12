package bookOfWu;

/* Problem 24 page 80
 * "An introduction to Object-Oriented Programming with Java"
 * by C. Thomas Wu
 */

import javax.swing.*;

public class MyFirstFrame {

	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("My First Frame");
		frame.setLocation(100, 50);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
