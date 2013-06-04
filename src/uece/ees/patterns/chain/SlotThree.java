package uece.ees.patterns.chain;

public class SlotThree extends MachineChain {

	public SlotThree() {
		super(Slots.slotThree);
	}

	@Override
	public int getValue() {
		System.out.println("Ten Cents");
		return 10;
	}
}