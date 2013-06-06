package uece.ees.patterns.chain;

public class SlotTwo extends MachineChain {

	public SlotTwo() {
		super(Slots.slotTwo);
	}

	@Override
	protected double payment() {
		System.out.println("SlotTwo: 0,25 cents");
		double payout = 0.25 * getCoins();
		double payBack = payout - getProductValue();
		if (payout == getProductValue()) {
			System.out.println("Get your product:" + getProductName()
					+ "\nValue:" + getProductValue() + "\nno Payout");
		} else {
			System.out.println("Get your product: " + getProductName()
					+ "\nValue:" + getProductValue() + "\npayBack:" + payBack);
		}
		return payout;
	}

}
