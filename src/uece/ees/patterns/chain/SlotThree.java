package uece.ees.patterns.chain;

public class SlotThree extends MachineChain {

	public SlotThree() {
		super(Slots.slotThree);
	}

	@Override
	protected double payment() {
		System.out.println("SlotThree: 0,50 cents");
		double payout = 0.50 * getCoins();
		double payBack = payout - getProductValue();
		if (payout == getProductValue()) {
			System.out.println("Get your product: " + getProductName()
					+ "\nValue:" + getProductValue() + "\nno Payout");
		} else {
			System.out.println("Get your product: " + getProductName()
					+ "\nValue:" + getProductValue() + "\npayBack:" + payBack);
		}
		return payout;
	}
}