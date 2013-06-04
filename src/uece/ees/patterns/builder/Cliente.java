package uece.ees.patterns.builder;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Atendimento atendente = new Atendimento(new Funcionario());
		Pedido pedido = atendente.pedidoCliente.getPedido();
		pedido.setSanduiche("cheese");
		pedido.setBatata("pequena");
		pedido.setBrinquedo("carrinho");
		pedido.setRefrigerante("coca");
		atendente.mcLancheFeliz();
		System.out.println(pedido);
	}

}
