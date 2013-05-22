package uece.ees.patterns.singleton;

public class Client {
	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.setActive(true);
		logger.log("PRIMEIRA MENSAGEM DE LOG");
		logger.log("SEGUNDA MENSAGEM DE LOG");
	}
}
