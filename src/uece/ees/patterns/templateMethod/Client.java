package uece.ees.patterns.templateMethod;

import java.util.Scanner;

public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convert converter;
		System.out
				.println("Insert to Convert type: (uppercase, lowercase, duplicate or revert)");
		Scanner scan = new Scanner(System.in);
		String select = scan.nextLine();
		switch (select) {
		case "uppercase":
			converter = new Convert(new ConvertToUpperCase());
			converter.convert();
			break;
		case "lowercase":
			converter = new Convert(new ConvertToLowerCase());
			converter.convert();
			break;
		case "duplicate":
			converter = new Convert(new ConvertToCopy());
			converter.convert();
			break;
		case "revert":
			converter = new Convert(new ConvertToRevert());
			converter.convert();
			break;

		default:
			break;
		}
	}
}
