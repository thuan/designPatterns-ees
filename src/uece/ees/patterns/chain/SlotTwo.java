package uece.ees.patterns.chain;

public class SlotTwo extends MachineChain {

	public SlotTwo() {
		super(Slots.slotTwo);
	}

	@Override
	public double getCoin() {
		System.out.println("Twenty-five cents");
		return 0.25;
	}

}
