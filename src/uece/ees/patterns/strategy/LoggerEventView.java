package uece.ees.patterns.strategy;

public class LoggerEventView implements LoggerStrategy {

	@Override
	public void setLog(Logger logger) {
		logger.setAtivo(true);
		logger.log("Log EventViewer");
	}

}
