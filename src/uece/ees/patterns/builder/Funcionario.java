package uece.ees.patterns.builder;

public class Funcionario extends PedidoBuilder {

	@Override
	void adicionarSanduiche() {
		pedido.adicionarDentroDaCaixa(pedido.getSanduiche());
	}

	@Override
	void adicionarRefrigerante() {
		pedido.adicionarForaDaCaixa(pedido.getRefrigerante());
	}

	@Override
	void adicionarBatata() {
		pedido.adicionarDentroDaCaixa(pedido.getBatata());
	}

	@Override
	void adicionarBrinquedo() {
		pedido.adicionarDentroDaCaixa(pedido.getBrinquedo());
	}

}
