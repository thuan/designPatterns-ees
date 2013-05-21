package uece.ees.patterns.templateMethod;

import java.util.Scanner;

public abstract class ConvertTemplate {

	abstract void converter(String string);
	
	public final void convert() {
		Scanner scan = new Scanner(System.in);
		System.out.println("convert:");
		String string = scan.nextLine();
		converter(string);
		System.out.println("convert:" + string + " successfull!");
	}
	
}
