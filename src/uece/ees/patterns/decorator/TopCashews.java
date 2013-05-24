package uece.ees.patterns.decorator;

public class TopCashews extends FrozenYogurtDecorator {

	public TopCashews(FrozenYogurt frozen) {
		super(frozen);
		name = "Cashews";
		cost = 2.5;
	}

}
