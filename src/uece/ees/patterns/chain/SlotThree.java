package uece.ees.patterns.chain;

public class SlotThree extends MachineChain {

	public SlotThree() {
		super(Slots.slotThree);
	}

	@Override
	public double getCoin() {
		System.out.println("fifty cents");
		return 0.50;
	}
}