package uece.ees.patterns.builder;

public abstract class PedidoBuilder {

	protected Pedido pedido;

	public PedidoBuilder() {
		pedido = new Pedido();
	}

	abstract void adicionarSanduiche();

	abstract void adicionarRefrigerante();

	abstract void adicionarBatata();

	abstract void adicionarBrinquedo();

	public Pedido getPedido() {
		return pedido;
	}

}
