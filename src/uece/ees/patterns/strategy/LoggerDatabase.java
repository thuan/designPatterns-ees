package uece.ees.patterns.strategy;

public class LoggerDatabase implements LoggerStrategy {

	public static LoggerDatabase instanceDatabase;

	@Override
	public void setLog(Logger logger) {
		if (logger.isAtivo()) {
			logger.log("DATABASE");
		}
	}

	public synchronized static LoggerDatabase getInstanceDatabase() {
		if (instanceDatabase == null) {
			LoggerDatabase.instanceDatabase = new LoggerDatabase();
		}
		return instanceDatabase;
	}

}
