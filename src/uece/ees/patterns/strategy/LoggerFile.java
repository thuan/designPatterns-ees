package uece.ees.patterns.strategy;

public class LoggerFile implements LoggerStrategy {

	@Override
	public void setLog(Logger logger) {
		if (logger.isAtivo()) {
			logger.log("FILE");
		}
	}
}
