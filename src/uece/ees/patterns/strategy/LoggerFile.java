package uece.ees.patterns.strategy;

public class LoggerFile implements LoggerStrategy {

	@Override
	public void setLog() {
		System.out.println("log file");
	}


}
