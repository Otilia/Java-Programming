package bookOfWu;

import java.util.*;

public class SplitString {

	public static void main(String[] args) {
		String text, firstRow, secondRow;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		System.out.print("Insert text: ");
		text = scanner.next();
		firstRow = text.substring(0, text.indexOf("!"));
		secondRow = text.substring(text.indexOf("!") + 1, text.length());
		System.out.println(firstRow);
		System.out.println(secondRow);
		scanner.close();
	}

}
