package uece.ees.patterns.chain;

public class Client {

	public static void main(String[] args) {

		MachineChain machine = new SlotOne();
		machine.setNextSlots(new SlotTwo());
		machine.setNextSlots(new SlotThree());

		try {
			machine.insertCoin(Slots.slotOne);
			machine.insertCoin(Slots.slotTwo);
			machine.insertCoin(Slots.slotThree);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
