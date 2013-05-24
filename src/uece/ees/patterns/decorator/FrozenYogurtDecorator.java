package uece.ees.patterns.decorator;

public abstract class FrozenYogurtDecorator extends FrozenYogurt {
	FrozenYogurt frozenYogurt;

	public FrozenYogurtDecorator(FrozenYogurt frozen) {
		super();
		this.frozenYogurt = frozen;
	}
	
	@Override
	public String getName() {
		return frozenYogurt.getName() + " + " + super.getName();
	}
	
	@Override
	public double getCost() {
		return frozenYogurt.getCost() + super.getCost();
	}
}
