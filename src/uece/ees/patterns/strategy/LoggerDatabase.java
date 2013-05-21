package uece.ees.patterns.strategy;

public class LoggerDatabase implements LoggerStrategy {

	@Override
	public void setLog(Logger logger) {
		logger.setAtivo(true);
		logger.log("Log Database");
	}

	

}
