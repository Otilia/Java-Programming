package bookOfWu;

import javax.swing.*;

class Ch2Sample1 {

	public static void main(String[] args) throws InterruptedException {
		JFrame myWindow;
		myWindow = new JFrame();
		myWindow.setSize(300, 200);
		myWindow.setTitle("My First Java Program");
		myWindow.setVisible(true);
		Thread.sleep(4000);
		myWindow.setVisible(false);
		Thread.sleep(4000);
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
