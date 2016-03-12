package bookOfWu;

/* Problem 25 page 80
 * "An introduction to Object-Oriented Programming with Java"
 * by C. Thomas Wu
 */

import javax.swing.*;

public class VisibleInvisibleFrame {

	public static void main(String[] args) {
		JFrame frame;
		frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("My First Frame");
		frame.setLocation(400, 400);
		frame.setVisible(true);
		try {Thread.sleep(500);} catch (Exception e) {}
		frame.setVisible(false);
		try {Thread.sleep(500);} catch (Exception e) {}
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
