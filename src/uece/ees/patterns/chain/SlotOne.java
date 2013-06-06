package uece.ees.patterns.chain;

public class SlotOne extends MachineChain {

	public SlotOne() {
		super(Slots.slotOne);
	}

	@Override
	protected double payment() {
		System.out.println("SlotOne: 0,10 cents");
		double payout = 0.10 * getCoins();
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
