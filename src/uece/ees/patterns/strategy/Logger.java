package uece.ees.patterns.strategy;

public class Logger {

	private boolean ativo = false;

	public static Logger instance;
	
	protected LoggerStrategy strategy;

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

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
}
