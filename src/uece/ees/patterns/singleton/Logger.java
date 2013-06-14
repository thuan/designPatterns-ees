package uece.ees.patterns.singleton;

public class Logger {

	private boolean active = false;
	public static Logger instance;

	public Logger() {
		
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void log(String string) {
		if (this.active) {
			System.out.println("LOG :: " + string);
		}

	}

	public synchronized static Logger getInstance() {
		if (instance == null) {
			Logger.instance = new Logger();
		}
		return instance;
	}
}
