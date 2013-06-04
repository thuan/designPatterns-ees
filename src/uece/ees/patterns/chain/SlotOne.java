package uece.ees.patterns.chain;

public class SlotOne extends MachineChain {

	public SlotOne() {
		super(Slots.slotOne);
	}

	@Override
	public double getCoin() {
		System.out.println("Ten cents");
		return 0.10;
	}

}
