package uece.ees.patterns.chain;

public class SlotTwo extends MachineChain {

	public SlotTwo() {
		super(Slots.slotTwo);
	}

	@Override
	public int getValue() {
		System.out.println("Five cents");
		return 5;
	}

}
