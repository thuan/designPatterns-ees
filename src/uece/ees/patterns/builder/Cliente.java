package uece.ees.patterns.builder;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Atendimento atendente = new Atendimento(new Funcionario());
		atendente.cadastrarPedido();
	}

}
