package uece.ees.patterns.chain;

public class Client {
	public static void main(String[] args) {

		MachineChain machine = new SlotOne();
		machine.setSlotMachine(new SlotTwo());
		machine.setSlotMachine(new SlotThree());

		try {
			machine.insertCoin(Slots.slotOne);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
