package bookOfWu;

import java.util.*;
import javax.swing.*;

class LastFirstWindow {

	public static void main(String[] args) {
		String first, last, title;
		JFrame myWindow;
		myWindow = new JFrame();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		first = scanner.next();
		System.out.print("Enter your last name: ");
		last = scanner.next();
		
		title = last + ", " + first;
		myWindow.setSize(300, 200);
		myWindow.setTitle(title);
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scanner.close();
	}

}
