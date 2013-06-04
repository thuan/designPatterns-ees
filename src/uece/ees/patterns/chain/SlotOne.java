package uece.ees.patterns.chain;

public class SlotOne extends MachineChain {

	public SlotOne() {
		super(Slots.slotOne);
	}

	@Override
	public int getValue() {
		System.out.println("One cent");
		return 1;
	}

}
