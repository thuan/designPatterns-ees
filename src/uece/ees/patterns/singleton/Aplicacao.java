package uece.ees.patterns.singleton;

public class Aplicacao {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.setAtivo(true);
		logger.log("PRIMEIRA MENSAGEM DE LOG");
		logger.log("SEGUNDA MENSAGEM DE LOG");
	}
}
