package uece.ees.patterns.decorator;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FrozenYogurt myFrozen = new Vanilla();
		System.out.println("Selected Flavor: " + myFrozen.getName() + " = " + myFrozen.getCost());
		myFrozen = new TopCashews(myFrozen);
		myFrozen = new TopChocolate(myFrozen);
		System.out.println(myFrozen.getName());
		System.out.println("Cost:" + myFrozen.getCost());
	}

}
