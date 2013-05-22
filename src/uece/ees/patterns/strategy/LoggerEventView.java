package uece.ees.patterns.strategy;

public class LoggerEventView implements LoggerStrategy {

	@Override
	public void setLog() {
		System.out.println("log eventView");
	}

}
