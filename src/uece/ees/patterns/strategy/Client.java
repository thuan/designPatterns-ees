package uece.ees.patterns.strategy;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Logger logger;
		System.out.println("Escolha o registro de log: File, EventView, Database");
		Scanner scan = new Scanner(System.in);
		String select = scan.nextLine();
		switch (select) {
		case "File":
			logger = new Logger(new LoggerFile());
			logger.setAtivo(true);
			logger.log();
			break;
		case "EventView":
			logger = new Logger(new LoggerEventView());
			logger.setAtivo(true);
			logger.log();
			break;
		case "Database":
			logger = new Logger(new LoggerDatabase());
			logger.setAtivo(true);
			logger.log();
		default:
			break;
		}

	}
}
