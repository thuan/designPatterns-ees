package uece.ees.patterns.chain;

public abstract class MachineChain {
	protected MachineChain slotMachine;
	protected Slots slots;

	public MachineChain(Slots slot) {
		slotMachine = null;
		this.slots = slot;
	}

	public abstract int getValue();

	public boolean isCoin(Slots slot) {
		if (slots == slot) {
			return true;
		}
		return false;
	}

	public void insertCoin(Slots slot) throws Exception {
		if (isCoin(slot)) {
			getValue();
		} else {
			if (slotMachine == null) {
				throw new Exception("Machine fails");
			}
		}
	}

	public void setSlotMachine(MachineChain machine) {
		if (slotMachine == null) {
			slotMachine = machine;
		} else {
			slotMachine.setSlotMachine(machine);
		}
	}
}
