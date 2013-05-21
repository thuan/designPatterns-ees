package uece.ees.patterns.singleton;

public class Logger {

	private boolean ativo = false;
	public static Logger instance;

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
