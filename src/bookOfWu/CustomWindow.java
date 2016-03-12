package bookOfWu;

import javax.swing.*;

class CustomWindow {

	public static void main(String[] args) {
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setSize(800, 600);
		myWindow.setTitle("Welcome to Java");
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
