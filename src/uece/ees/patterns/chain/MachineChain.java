package uece.ees.patterns.chain;

public abstract class MachineChain {

	protected MachineChain nextSlots;
	protected Slots selectedSlot;
	private String productName;
	private double productValue;
	private int coins;

	protected abstract double payment();

	public MachineChain(Slots slots) {
		nextSlots = null;
		selectedSlot = slots;
	}

	public boolean isMachineSlot(Slots slots) {
		if (selectedSlot == slots) {
			return true;
		}
		return false;
	}

	public void paymentSlot(Slots slots) throws Exception {
		if (isMachineSlot(slots)) {
			payment();
		} else {
			if (nextSlots == null) {
				throw new Exception("invalid slot");
			}
			nextSlots.paymentSlot(slots);
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductValue() {
		return productValue;
	}

	public void setProductValue(double productValue) {
		this.productValue = productValue;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public void setNextSlots(MachineChain next) {
		if (nextSlots == null) {
			nextSlots = next;
		} else {
			nextSlots.setNextSlots(next);
		}
	}

}
