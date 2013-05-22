package uece.ees.patterns.strategy;

public class LoggerDatabase implements LoggerStrategy {

	@Override
	public void setLog() {
		System.out.println("log database");

	}

	

}
