package uece.ees.patterns.builder;

public class Atendimento {

	protected PedidoBuilder pedidoCliente;
	
	public Atendimento(PedidoBuilder pedido) {
		this.pedidoCliente = pedido;
	}

	public void cadastrarPedido() {
		pedidoCliente.getPedido();

	}

	public PedidoBuilder getPedidoCliente() {
		return pedidoCliente;
	}

}
