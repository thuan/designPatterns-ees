package uece.ees.patterns.chain;

public class Client {

	public static void main(String[] args) {
		// set slots
		MachineChain coinSlots = new SlotThree();
		coinSlots.setNextSlots(new SlotTwo());
		coinSlots.setNextSlots(new SlotOne());
		// select slot
		coinSlots.setProductName("Soda");
		coinSlots.setProductValue(1.00);
		coinSlots.setCoins(20);
		// select the payment form
		try {
			coinSlots.paymentSlot(Slots.slotOne);
			coinSlots.paymentSlot(Slots.slotTwo);
			coinSlots.paymentSlot(Slots.slotThree);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
