package uece.ees.patterns.chain;

public abstract class MachineChain {

	protected MachineChain nextSlots;
	private String productName;
	private double productValue;
	protected Slots selectedSlot;

	public abstract double getCoin();

	public MachineChain(Slots slots) {
		nextSlots = null;
		selectedSlot = slots;
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

	public boolean validation(Slots slots) {
		if (selectedSlot == slots) {
			return true;
		}
		return false;
	}

	public void insertCoin(Slots slots) throws Exception {
		if (validation(slots)) {
			getCoin();
		} else {
			if (nextSlots == null) {
				throw new Exception("Machine fails");
			}
		}
	}

	public void setNextSlots(MachineChain nextSlots) {
		this.nextSlots = nextSlots;
	}

}
