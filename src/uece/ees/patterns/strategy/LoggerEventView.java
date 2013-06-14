package uece.ees.patterns.strategy;

public class LoggerEventView implements LoggerStrategy {

	@Override
	public void setLog(Logger logger) {
		if (logger.isAtivo()) {
			logger.log("EVENTVIEW");
		}
	}
}
