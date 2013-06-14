package uece.ees.patterns.strategy;

public class Logger {

	private boolean ativo = false;
	public static Logger instance;
	public LoggerStrategy strategy;

	public Logger() {
	
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void log(String string) {
		if (this.ativo) {
			System.out.println("LOG :: " + string);
		}
	}

	public synchronized static Logger getInstance() {
		if (instance == null) {
			Logger.instance = new Logger();
		}
		return Logger.instance;
	}

}
