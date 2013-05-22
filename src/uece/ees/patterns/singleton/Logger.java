package uece.ees.patterns.singleton;

public class Logger {

	private boolean active = false;
	public static Logger instance;

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

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
}
