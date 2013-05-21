package uece.ees.patterns.templateMethod;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Convert lower = new Convert(new ConvertToLowerCase());
		lower.convert();
		Convert upper = new Convert(new ConvertToUpperCase());
		upper.convert();
		Convert copy = new Convert(new ConvertToCopy());
		copy.convert();
		Convert revert = new Convert(new ConvertToRevert());
		revert.convert();
	}

}
