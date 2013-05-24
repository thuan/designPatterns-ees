package uece.ees.patterns.decorator;

public class TopChocolate extends FrozenYogurtDecorator {

	public TopChocolate(FrozenYogurt frozen) {
		super(frozen);
		name = "Chocolate";
		cost = 1.5;
	}

}
