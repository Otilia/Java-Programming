package bookOfWu;

/* Problem 23 page 79
 * An introduction to Object-Oriented Programming with Java
 * by C. Thomas Wu
 */

import javax.swing.*;
import java.util.*;
import java.text.*;

class CurrentTimeWindow {

	public static void main(String[] args) {
		Date today;
		today = new Date();
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("hh:mm:ss a");
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setSize(300, 200);
		myWindow.setTitle(sdf.format(today));	
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
